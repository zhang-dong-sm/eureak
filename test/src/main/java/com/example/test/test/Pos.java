package com.example.test.test;

import com.example.test.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//执行顺序  constructor->autowried->postConstructor
@Component
public class Pos {

    @Autowired
    Student student;

    public Pos(){
//        System.out.println("构造器");
    }

    @PostConstruct
    private  void run(){
//        Student a=new Student();
//
//        System.out.println(a.hashCode());
//
//        System.out.println("运行");
//      System.out.println(student);
//        return "aa";
    }


    public void init(){
        System.out.println("init");
    }
}
