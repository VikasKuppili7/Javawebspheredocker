package com.vikky.javawebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JavaWebAppApplication  extends SpringBootServletInitializer {
    // Override the configure method to specify the application's primary source
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JavaWebAppApplication.class);
    }
    public static void main(String[] args) {

        SpringApplication.run(JavaWebAppApplication.class, args);
    }

}
