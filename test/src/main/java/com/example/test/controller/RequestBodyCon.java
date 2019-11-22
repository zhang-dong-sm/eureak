package com.example.test.controller;

import com.example.test.po.RequestVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function
 *
 * @author zhangd <zhangd@shinemo.com>
 * @date 2019/11/15 9:43
 */
@RestController
@RequestMapping("/body")
public class RequestBodyCon {


    @RequestMapping("/aa")
    public void aa(@RequestBody RequestVo vo){
        System.out.println(vo.toString());

    }

}
