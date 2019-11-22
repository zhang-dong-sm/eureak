package com.example.eurekastudent.repository;

import com.example.eurekastudent.vo.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentDao extends JpaRepository<Student,Long> {
}
