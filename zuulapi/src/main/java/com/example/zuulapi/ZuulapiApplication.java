package com.example.zuulapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulServer
@SpringBootApplication
public class ZuulapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulapiApplication.class, args);
    }

}
