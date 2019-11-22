package com.example.test.test;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Function 定时任务
 *
 * @author zhangd <zhangd@shinemo.com>
 * @date 2019/11/15 17:29
 */
@Component
@EnableScheduling

public class Timem {

    @Scheduled(cron = "*/5 * * * * *")
    public void aa(){
        System.out.println("1111");

    }
}
