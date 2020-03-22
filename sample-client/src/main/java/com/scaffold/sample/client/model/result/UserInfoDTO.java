package com.scaffold.sample.client.model.result;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @program: scaffold
 * @description:
 * @author: wanglei
 * @create: 2020-03-19 18:48
 **/
@Data
public class UserInfoDTO {
    private Integer id;
    private String name;
    private Integer age;
    private String idCard;
    private String fundCode;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
