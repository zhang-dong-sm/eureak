package com.example.test.config;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsynTest {

    @Async
    public void aa(int t){
        for(int i=0;i<=t;i++){
            System.out.println(i);
            try{
                if(i==2) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(4000);
                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("2异常发生");
            }

        }

    }

    @Async
    public void bb() {
        for(int i=5;i<=7;i++) {
            System.out.println(i);
            try {
                if (i == 6) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(4000);
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("6异常发生");
            }
        }
    }

}
