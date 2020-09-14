package com.scaffold.sample.client.service.hystrix;

import com.google.common.collect.Lists;
import com.scaffold.sample.client.model.param.PageParam;
import com.scaffold.sample.client.model.result.UserInfoDTO;
import com.scaffold.sample.client.service.ISampleFeignService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 功能描述: feign降级方法 <br/>
 *
 * @author leiwa
 * @date: 2020-09-14 17:38<br/>
 * @since JDK 1.8
 */
@Slf4j
@Component
public class SampleFeignServiceHystrix implements FallbackFactory<ISampleFeignService> {


    @Override
    public ISampleFeignService create(Throwable throwable) {
        log.info("SampleFeignServiceHystrix 异常执行回退方法");

        return new ISampleFeignService() {
            @Override
            public UserInfoDTO getUserById(PageParam pageParam) {
                UserInfoDTO userInfoDTO = new UserInfoDTO();
                return userInfoDTO;
            }

            @Override
            public List<UserInfoDTO> getAllUserInfo() {
                List<UserInfoDTO> list = Lists.newArrayList();
                return list;
            }
        };
    }
}
