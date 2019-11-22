package com.example.test.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

/**
 * Function
 *
 * @author zhangd <zhangd@shinemo.com>
 * @date 2019/11/21 9:30
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Zd {
    @Value("zhangsan")
    private String name;
    private Integer id;
    private Date date;

}
