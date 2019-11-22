package com.example.eurekastudent.vo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
}
