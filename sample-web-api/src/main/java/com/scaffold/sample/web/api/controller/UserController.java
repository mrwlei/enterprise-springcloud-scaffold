package com.scaffold.sample.web.api.controller;

import com.scaffold.sample.web.api.common.ResultMapper;
import com.scaffold.sample.client.model.param.PageParam;
import com.scaffold.sample.client.model.result.UserInfoDTO;
import com.scaffold.sample.client.service.ISampleFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: scaffold
 * @description:
 * @author: wanglei
 * @create: 2020-03-21 20:24
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private ISampleFeignService sampleFeignService;

    @RequestMapping("getUserById")
    public ResultMapper<UserInfoDTO> getUserById(String userId) {
        PageParam pageParam = new PageParam();
        pageParam.setUserId(Integer.parseInt(userId));
        UserInfoDTO result = sampleFeignService.getUserById(pageParam);
        return new ResultMapper<>(result);
    }

    @RequestMapping("getAllUser")
    public ResultMapper<List<UserInfoDTO>> getAllUser() {
        List<UserInfoDTO> allUserInfo = sampleFeignService.getAllUserInfo();
        return new ResultMapper<>(allUserInfo);
    }

}
