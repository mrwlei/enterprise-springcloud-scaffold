package com.scaffold.sample.server.service;

import com.scaffold.sample.server.entity.User;

import java.util.List;

/**
 * @program: scaffold
 * @description:
 * @author: wanglei
 * @create: 2020-03-19 18:48
 **/
public interface ISampleService {
     User getUserById(Integer id);
     List<User> getAllUser();
}
