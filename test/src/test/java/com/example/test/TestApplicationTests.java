package com.example.test;


import com.example.test.common.Conn;
import com.example.test.config.AsynTest;
import com.example.test.dao.StudentDao;
import com.example.test.dao.StudentDaoProxy;
import com.example.test.po.Student;
import com.example.test.po.Zd;
import com.example.test.test.Timem;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class TestApplicationTests {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    SqlSessionTemplate template;

    @Autowired
    SqlSession sqlSession;

    @Resource
    Student sudent;

    @Autowired(required = false)
    StudentDaoProxy proxy;

    @Autowired
    AsynTest test;

    @Autowired
    ApplicationContext context;

    @Autowired
    ServletContext con;

    @Autowired
    Timem timem;


    @Test
    void contextLoads() {
        System.out.println(StudentDao.class.getName());
        Object o = sqlSessionTemplate.selectList("");

        System.out.println(o);
    }

    @Test
    void aa() throws SQLException {

        Connection connection = Conn.getConn(1,"a");
        //Statement statement1=connection.createStatement();
//        PreparedStatement statement2=connection.prepareStatement("desc student");

       /* ResultSet desc = statement2.executeQuery();
        while(desc.next()){
            StringBuilder builder=new StringBuilder();

            builder.append(desc.getString("field")).append(desc.getString("type"))
            .append(desc.getString("null")).append(desc.getString("key"))
                    .append(desc.getString("default")).append(desc.getString("extra"));
            System.out.println(builder.toString());
        }*/
        PreparedStatement statement = connection.prepareStatement("select * from student");
       /* ResultSetMetaData metaData = statement.getMetaData();
        for(int i=1;i<=metaData.getColumnCount();i++){
            StringBuilder builder=new StringBuilder();
            builder.append(metaData.getColumnName(i))
          .append(metaData.getColumnTypeName(i))
           .append(metaData.isSigned(i)).append(metaData.isNullable(i)).append(metaData.isAutoIncrement(i));
            System.out.println(builder.toString());
        }*/

       StringBuilder builder=new StringBuilder();
       builder.append("insert into student(");
        ResultSet resultSet = statement.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
        for(int i=1;i<=metaData.getColumnCount();i++){
            builder.append(metaData.getColumnName(i)+",");
        }
       builder=builder.deleteCharAt(builder.length()-1);
        builder.append(") values");
        int count =metaData.getColumnCount();
        while (resultSet.next()) {
            builder.append("(");
            for (int i = 1; i <= count; i++) {
                if(metaData.getColumnName(i).contains("me")){

                   /* if(metaData.getColumnName(i).contains("name")){
                        builder.append((String)(resultSet.getObject(i))+",");
                        continue;
                    }*/
                    String temp=resultSet.getObject(i).toString();
                    System.out.println(temp);
                    builder.append("\""+temp+"\",");
                }
                else
                     builder.append(resultSet.getObject(i)+",");
            }
            builder.deleteCharAt(builder.length()-1);
            builder.append("),");

        }

        String sql=builder.substring(0,builder.length()-1);
        log.info("sql 语句 sql:{}",sql);
        statement=connection.prepareStatement("truncate table student");
        statement.executeUpdate();
        log.info("truncate 语句 sql:{}","truncate table student");
        statement=connection.prepareStatement(sql);
        statement.executeUpdate();
        log.info("insert success sql:{}",sql);
        String aa="wangwu)";
        String all="insert into student(name) values("+aa;
        statement=connection.prepareStatement(all);
        statement.executeUpdate();
       /* resultSet.next();
        String replace = resultSet.getString(2)
                .replace("CREATE TABLE ", "create table if not exists");
        System.out.println(replace);
        statement=connection.prepareStatement("create table if not exists xx(id int)");
        System.out.println(statement.execute());*/


    }


    @Test
    void cc() {
//        timem.aa();
//        System.out.println(con);
//        con.setAttribute("token",null);
//        Student student=new Student();
//        student.setId(1l);
        //  System.out.println(template.selectList("com.example.test.dao.StudentDao.select",student));
        // System.out.println(sqlSession.selectList("select * from student",student));
//        System.out.println(ApplicationGet.getContext());
        List<Long> all= new ArrayList<>(); all.add(1l);all.add(2l);
        List<Long> all1=new ArrayList<>(); all1.add(11l);all1.add(2l);all1.add(3l);
        System.out.println(all);
        System.out.println(all1);
        System.out.println(all.removeAll(all1));
        System.out.println(all);
    }

    @Test
    public void async() throws Exception {
        Zd zd = new Zd();
        Zd zd2 = new Zd("lisi", 2, new Date());
        zd.setId(2);
        zd.setName("haha");
        System.out.println(zd.toString());
        Zd zd1 = Zd.builder().id(1).name("ss").date(new Date()).build();
        System.out.println(zd1);
    }
    @Test
    public void aa1(){
        System.out.println("aaaaa");
    }

}
