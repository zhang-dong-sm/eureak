package com.example.eurekateacher.easyServer;

import com.example.eurekateacher.po.Student;

//@Component
public class StudentHystrix implements StudentSever{
    @Override
    public Student select(Long cc) {
        return new Student();
    }

    @Override
    public Student saveStudent(Student student) {
        return new Student();
    }

    @Override
    public void deleteStudent(Long cc) {

    }
}
