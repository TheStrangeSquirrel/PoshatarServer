/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.controllers;

import net.squirrel.poshtar.dto.Response;
import net.squirrel.poshtar.server.utils.LogUtils;
import net.squirrel.poshtar.server.utils.XmlTransforming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class ErrorController extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(LogUtils.getContextClass());
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String errorMassage = "Error";
        try(Writer writer = resp.getWriter()) {
            String errorResult = XmlTransforming.marshalling( new Response(errorMassage));
            writer.write(errorResult);
            writer.flush();
        }catch (Exception e){
            logger.error("An error occurred while trying to send error message");
        }

    }
}
