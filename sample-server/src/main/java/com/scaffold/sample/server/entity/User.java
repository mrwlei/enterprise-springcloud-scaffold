package com.scaffold.sample.server.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @program: scaffold
 * @description:
 * @author: wanglei
 * @create: 2020-03-19 18:48
 **/
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String idCard;
    private String fundCode;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
