/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.controllers;

import net.squirrel.poshtar.dto.Request;
import net.squirrel.poshtar.server.ProvidersManager;
import net.squirrel.poshtar.server.post.Post;
import net.squirrel.poshtar.server.utils.IOUtils;
import net.squirrel.poshtar.server.utils.LogUtils;
import net.squirrel.poshtar.server.utils.XmlTransforming;
import net.squirrel.poshtar.server.utils.inject.DependencyInjectionServlet;
import net.squirrel.poshtar.server.utils.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class TrackController extends DependencyInjectionServlet {
    private static final String ERROR_PAGE = "/error";
    private static final  Logger logger = LoggerFactory.getLogger(LogUtils.getContextClass());
    private static final int COUNT_ATTEMPTS = 72;

    @Inject("providersManager")
    private ProvidersManager providersManager;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/xml");
        try (InputStream inputStream = req.getInputStream(); PrintWriter writer = resp.getWriter()) {
            String xml = IOUtils.toString(inputStream);
            logger.info("Trying track:");
            Request request = XmlTransforming.unmarshalling(xml, Request.class);
            logger.info("Trying track: ProviderId {}",request.getProviderId());
            Post post = providersManager.instancePost(request.getProviderId());
            String trackInfo = "";
            for(int i = 0; i < COUNT_ATTEMPTS; i++ ){
                try {
                    trackInfo = post.track(request.getTrackNumber(),request.getLanguage());
                    break;
                }catch (Exception e){
                //NOP
                }
            }

            resp.setStatus(200);
            writer.write(trackInfo);
            writer.flush();
        } catch (Exception e) {
            logger.warn("Redirect error controller",e);
            RequestDispatcher dispatcher = req.getRequestDispatcher(ERROR_PAGE);
            dispatcher.forward(req,resp);

            resp.sendRedirect("/error");
        }

    }

}
