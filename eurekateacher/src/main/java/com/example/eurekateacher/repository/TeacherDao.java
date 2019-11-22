package com.example.eurekateacher.repository;


import com.example.eurekateacher.po.Teacher;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao {

    @Autowired
    private JdbcTemplate template;

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public void save(Teacher teacher){
        template.update("insert into teacher values(?,?,?,?)",teacher.getId(),
                teacher.getName(),teacher.getAge(),teacher.getBorn());
    }
    public void delete(Long id){
        template.update("delete from teacher where id=?",id);
    }
    public void update(Teacher teacher){

    }
    public Teacher select(Long id){
        return template.queryForObject("select * from teacher where id=?",new BeanPropertyRowMapper<>(Teacher.class),id);
    }

    public void crud(){
        sqlSessionTemplate.selectList("","");
    }
}
