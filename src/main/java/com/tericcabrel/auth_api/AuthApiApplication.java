package com.tericcabrel.auth_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthApiApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AuthApiApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AuthApiApplication.class, args);
    }
}

