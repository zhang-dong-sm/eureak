package com.example.eurekateacher.service;


import com.example.eurekateacher.po.Teacher;
import com.example.eurekateacher.repository.TeacherDao;
import com.example.eurekateacher.repository.TeacherMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class TeacherService {
    @Autowired
    TeacherDao dao;

    @Autowired
    TeacherMapper mapper;
    public Teacher select(Long id){


        return mapper.select(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public void save(Teacher teacher){

        mapper.save(teacher);
    }
}
