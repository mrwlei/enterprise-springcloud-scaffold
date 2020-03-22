package com.scaffold.sample.server.service.impl;

import com.scaffold.sample.server.dao.UserInfoMapper;
import com.scaffold.sample.server.entity.User;
import com.scaffold.sample.server.service.ISampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: scaffold
 * @description: 实现类
 * @author: wanglei
 * @create: 2020-03-19 18:50
 **/
@Service
public class SampleServiceImpl implements ISampleService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public User getUserById(Integer id) {
        return userInfoMapper.getUserById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userInfoMapper.getAllUser();
    }
}
