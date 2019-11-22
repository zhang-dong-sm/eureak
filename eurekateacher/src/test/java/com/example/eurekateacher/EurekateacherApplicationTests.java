package com.example.eurekateacher;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;


@SpringBootTest
@RunWith(SpringRunner.class)
public class EurekateacherApplicationTests {

    @Autowired
    JdbcTemplate template;

    @Autowired
    DataSource dataSource;






    @Test
    public void contextLoads() throws  Exception{
        System.out.println(dataSource.getClass());
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());
    }
    @Test
    public void aa(){

    }

}
