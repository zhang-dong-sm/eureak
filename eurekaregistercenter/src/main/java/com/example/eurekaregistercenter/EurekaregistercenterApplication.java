package com.example.eurekaregistercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaregistercenterApplication {

    public static void main(String[] args) {
        SpringApplication. run(EurekaregistercenterApplication.class, args);
    }

}
