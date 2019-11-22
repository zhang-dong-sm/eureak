package com.example.test.common;

import lombok.Getter;


@Getter
public enum MessageEnum {

    SUCCESS(200,"成功"),FAILD(250,"失败");

    private int code;
    private String msg;
    private MessageEnum(int code,String msg){
        this.code=code;
        this.msg=msg;
    }


}
