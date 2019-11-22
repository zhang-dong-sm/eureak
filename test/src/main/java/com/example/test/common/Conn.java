package com.example.test.common;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Function
 *
 * @author zhangd <zhangd@shinemo.com>
 * @date 2019/11/14 10:20
 */
@Slf4j
public class Conn {
    private static Connection connection;

    public static Connection getConn(Integer type,String db){
        try{
                if(connection==null) {
                    Pro pro = Pro.getPro(type);
                    if (pro == null) {
                        throw new Exception("类型不对");
                    }
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    connection = DriverManager.getConnection(pro.getUrl() + db + "?serverTimezone = GMT", pro.getUsername(), pro.getPassword());
                    log.info("连接创建成功");
                }
        }catch (Exception e){
            log.info("连接创建失败");
            e.printStackTrace();
        }
        return connection;
    }

}
@Getter
enum Pro{
    Test("jdbc:mysql://localhost:3306/","root","123456",1),
    Shine("jdbc:mysql://10.0.10.41:3306/","root","shinemo123",2);
    private String url;
    private String username;
    private String password;
    private Integer type;
    private Pro(String url,String username,String password,Integer type){
        this.url=url;
        this.password=password;
        this.username=username;
        this.type=type;
    }
    public static Pro getPro(Integer type){
        for(Pro pro:Pro.values()){
            if(pro.type.equals(type)){
                return pro;
            }

        }
        return  null;
    }
}