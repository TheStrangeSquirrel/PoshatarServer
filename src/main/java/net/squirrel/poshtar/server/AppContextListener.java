/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppContextListener  implements ServletContextListener{
    public static final String APP_CONTEXT = "context.xml";
    private static  ApplicationContext context;

    public static ApplicationContext getContext() {
        return context;
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        context = new ClassPathXmlApplicationContext(APP_CONTEXT);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
