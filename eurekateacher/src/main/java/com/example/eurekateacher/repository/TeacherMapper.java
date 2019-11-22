package com.example.eurekateacher.repository;

import com.example.eurekateacher.po.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
    public Teacher select(Long id);
    public void save(Teacher teacher);

    @Delete("delete from teacher where id=#{id}")
    public void delete(Long id);
}
