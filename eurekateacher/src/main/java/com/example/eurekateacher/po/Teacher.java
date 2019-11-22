package com.example.eurekateacher.po;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Setter
@Getter
public class Teacher {
    private Long id;
    private String name;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date born;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", born=" + born +
                '}';
    }
}
