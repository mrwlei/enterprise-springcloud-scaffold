package com.scaffold.sample.server.controller;

import com.google.common.collect.Lists;
import com.scaffold.sample.client.model.param.PageParam;
import com.scaffold.sample.client.model.result.UserInfoDTO;
import com.scaffold.sample.client.service.ISampleFeignService;
import com.scaffold.sample.server.entity.User;
import com.scaffold.sample.server.service.ISampleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: scaffold
 * @description: xxxFeign的实现类
 * @author: wanglei
 * @create: 2020-03-19 18:46
 **/
@RestController
public class SampleFeignController implements ISampleFeignService {

    @Autowired
    private ISampleService sampleService;


    @Override
    public UserInfoDTO getUserById(PageParam pageParam) {
        UserInfoDTO dto = new UserInfoDTO();
        User user = sampleService.getUserById(pageParam.getUserId());
        BeanUtils.copyProperties(user,dto);
        return dto;
    }

    @Override
    public List<UserInfoDTO> getAllUserInfo() {
        List<UserInfoDTO> list = Lists.newArrayList();
        List<User> allUser = sampleService.getAllUser();
        allUser.forEach(e -> {
            UserInfoDTO dto = new UserInfoDTO();
            BeanUtils.copyProperties(e,dto);
            list.add(dto);
        });
        return list;
    }
}
