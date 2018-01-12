/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enjoylearn.springbootjsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author sihai
 */
@SpringBootApplication
public class App {
    public static void main(String[] argv){
        SpringApplication.run(App.class, argv);
    }
//
//    @Bean
//    public ServletRegistrationBean facesServletRegistration() {
//        ServletRegistrationBean registration = new ServletRegistrationBean(
//                new FacesServlet(), "*.jsf");
//        registration.setLoadOnStartup(1);
//        return registration;
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean<ConfigureListener> jsfConfigureListener() {
//        return new ServletListenerRegistrationBean<ConfigureListener>(
//                new ConfigureListener());
//    }
//
//    @Override
//    public void setServletContext(ServletContext servletContext) {
//        servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
//    }    
}
