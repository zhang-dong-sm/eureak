package com.example.eurekastudent.controller;


import com.example.eurekastudent.server.StudentServer;
import com.example.eurekastudent.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentServer studentServer;

    @GetMapping("/delete")
    public void deleteStudent(Long id){
        studentServer.deleteStudent(id);
    }

    @GetMapping("/select")
    public Student selectById(Long id){
        return studentServer.selectById(id);
    }

    @PostMapping("/save")
    public Student save(@RequestBody  Student student){

        return studentServer.addAndUpdateStudent(student);
    }

}
