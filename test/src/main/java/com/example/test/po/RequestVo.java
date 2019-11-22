package com.example.test.po;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Function
 *
 * @author zhangd <zhangd@shinemo.com>
 * @date 2019/11/15 9:44
 */
@Data
public class RequestVo {
    private Integer id;
    private String name;
    private String info;
    private List<Info> infos;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date date;
    private String date1;
    private Info dd;

}
