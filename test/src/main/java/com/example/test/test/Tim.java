package com.example.test.test;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;


@EnableScheduling
@Component
public class Tim {

//    @Scheduled(fixedDelay = 1000)
    public void run(){
        //new Thread(()->{System.out.println("aa");}).start();
        System.out.println("aa");
    }


}
