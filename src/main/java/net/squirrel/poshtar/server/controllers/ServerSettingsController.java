/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.controllers;

import net.squirrel.poshtar.server.SettingsManager;
import net.squirrel.poshtar.server.utils.inject.DependencyInjectionServlet;
import net.squirrel.poshtar.server.utils.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static net.squirrel.poshtar.server.utils.LogUtils.getContextClass;

public class ServerSettingsController extends DependencyInjectionServlet {
    private static final Logger logger = LoggerFactory.getLogger(getContextClass());

    @Inject("settingsManager")
    private SettingsManager settingsManager;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter writer = resp.getWriter()) {
            String xml = settingsManager.getXmlServerSettings();
            resp.setStatus(200);
            writer.write(xml);
            writer.flush();
        } catch (Exception e) {
            logger.error("Could not give settings", e);
        }
        logger.debug("Send settings");
    }
}
