package com.example.test.dao;


import com.example.test.po.Student;

public interface StudentDao {

    Student select(Long id);
    Student save(Student student);


}
