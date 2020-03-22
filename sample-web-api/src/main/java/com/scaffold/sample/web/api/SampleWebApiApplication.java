package com.scaffold.sample.web.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 聚合各个微服务，WEB API
 * @author leiwa
 */
@EnableFeignClients(basePackages = {
        "com.scaffold.sample.client"
        })
@SpringBootApplication(scanBasePackages = {
        "com.scaffold.sample.web.api"
        }, exclude={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableEurekaClient
public class SampleWebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleWebApiApplication.class, args);
    }

}
