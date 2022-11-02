package com.paha141.test;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class MyAppContext extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        servletContext.setInitParameter("spring.profiles.active", "prod");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationContext.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ApplicationContext.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
