package com.example.test.config;

import java.util.concurrent.FutureTask;

//继承Thread类  实现Runnable接口  Future和Callable
public class ThreadMethod implements Runnable{

    @Override
    public void run() {

    }

    public static void main(String[] args) throws Exception{
        Thread a=new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };
        FutureTask<String> futureTask=new FutureTask(()->{return "hello";});
        new Thread(futureTask).start();
        futureTask.get();
    }

}
