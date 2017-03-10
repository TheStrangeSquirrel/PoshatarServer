/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.utils.inject;

import net.squirrel.poshtar.server.AppContextListener;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.lang.reflect.Field;
import java.util.List;

public class DependencyInjectionServlet extends HttpServlet {
//    public static final String APP_CONTEXT = "appContextDAO-AOPShema.xml";
    public DependencyInjectionServlet(){
        try {
            init();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    public void init() throws ServletException {
//        ApplicationContext context = new ClassPathXmlApplicationContext(APP_CONTEXT);
        ApplicationContext context = AppContextListener.getContext();
        List<Field> fields = FieldReflector.collectUpTo(this.getClass(), DependencyInjectionServlet.class);
        fields = FieldReflector.filterInject(fields);
        for(Field field : fields){
            field.setAccessible(true);
            Inject annotation = field.getAnnotation(Inject.class);
            String beanName = annotation.value();
            Object bean = context.getBean(beanName);
            if(bean == null){
                throw new ServletException("***There is wos bean was hare" );
            }
            try {
                field.set(this,bean);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}

