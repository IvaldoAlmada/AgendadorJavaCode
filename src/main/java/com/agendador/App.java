package com.agendador;

import org.apache.catalina.authenticator.jaspic.AuthConfigFactoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.DispatcherServlet;

import javax.security.auth.message.config.AuthConfigFactory;

/**
 * Created by Ivaldo on 12/10/2016.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.agendador")
@EnableAutoConfiguration
public class App {

    public static void main(String[] args) {
        if (AuthConfigFactory.getFactory() == null) {
            AuthConfigFactory.setFactory(new AuthConfigFactoryImpl());
        }
        ApplicationContext applicationContext = SpringApplication.run(App.class, args);
        DispatcherServlet dispatcherServlet = (DispatcherServlet) applicationContext.getBean("dispatcherServlet");
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
    }
}
