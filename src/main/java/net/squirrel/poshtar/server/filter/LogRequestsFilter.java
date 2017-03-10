/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.filter;

import net.squirrel.poshtar.server.utils.LogUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LogRequestsFilter implements Filter {
   private static Logger logger = LoggerFactory.getLogger(LogUtils.getContextClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String method = ((HttpServletRequest) request).getMethod();

        String massage = "Request: "+ request.getProtocol()+ "  " + method + "  " +  request.getLocalAddr() + " : " +  request.getLocalPort();;
        logger.info(massage);
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
