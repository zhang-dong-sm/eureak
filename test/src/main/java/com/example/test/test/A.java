package com.example.test.test;

import com.example.test.common.Conn;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Function
 *
 * @author zhangd <zhangd@shinemo.com>
 * @date 2019/11/15 14:37
 */
public class A {
    @Autowired
    Conn conn;

    public void aa(){
        System.out.println(conn);
    }


}
