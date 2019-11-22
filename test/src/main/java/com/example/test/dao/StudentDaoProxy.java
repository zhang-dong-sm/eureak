package com.example.test.dao;

import org.mybatis.spring.SqlSessionTemplate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StudentDaoProxy {

    static SqlSessionTemplate template;

    public static void main(String[] args) {
        Proxy.newProxyInstance(StudentDao.class.getClassLoader(), new Class[]{StudentDao.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                return template.selectList(StudentDao.class.getName()+"."+method.getName(),args);
                
            }
        });
    }
}
