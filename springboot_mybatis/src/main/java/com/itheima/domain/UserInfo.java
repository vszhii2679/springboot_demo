package com.itheima.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
//Data 用来生成 getter、setter toString
@Data
//无参和满参构造
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private Integer id;
    private String name;
    private Integer age;
}
