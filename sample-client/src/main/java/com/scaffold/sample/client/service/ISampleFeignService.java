package com.scaffold.sample.client.service;

import com.scaffold.sample.client.feign.SampleFeignConfig;
import com.scaffold.sample.client.model.param.PageParam;
import com.scaffold.sample.client.model.result.UserInfoDTO;
import com.scaffold.sample.client.service.hystrix.SampleFeignServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Feign服务方法
 * @author leiwa
 */
@FeignClient(url="${sample.server.url}",name = "sample-server",path = "sample-path",
            configuration = SampleFeignConfig.class,primary = false,fallbackFactory = SampleFeignServiceHystrix.class)
public interface ISampleFeignService {

    /**
     * 获取用户信息
     * @param pageParam
     * @return
     */
    @RequestMapping(value = "getUserById",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    UserInfoDTO getUserById(@RequestBody PageParam pageParam);

    /**
     * 获取所有用户信息
     * @return
     */
    @RequestMapping(value = "getAllUserInfo",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<UserInfoDTO> getAllUserInfo();

}
