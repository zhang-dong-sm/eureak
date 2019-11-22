package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

//@MapperScan(basePackages = "com.example.test.dao")
@SpringBootApplication
@EnableAsync
public class TestApplication {




    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
       /* AsynTest test=new AsynTest();
        test.aa(3);
        test.bb();
        System.out.println("finished");*/
    }



}
