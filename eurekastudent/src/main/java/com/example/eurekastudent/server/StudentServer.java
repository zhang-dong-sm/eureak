package com.example.eurekastudent.server;

import com.example.eurekastudent.repository.StudentDao;
import com.example.eurekastudent.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServer {
    @Autowired
    private StudentDao studentDao;

    public Student addAndUpdateStudent(Student student){

        return studentDao.save(student);
    }
    public void deleteStudent(Long id){
        studentDao.deleteById(id);
    }
    public Student selectById(Long id){
        return studentDao.findById(id).get();
    }

}
