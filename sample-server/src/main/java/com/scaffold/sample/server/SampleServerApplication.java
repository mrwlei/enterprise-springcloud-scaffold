package com.scaffold.sample.server;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * xxx服务启动类
 * @author leiwa
 */
@EnableFeignClients(basePackages = {
        "com.scaffold.sample.client"
})
@SpringBootApplication(scanBasePackages = {"com.scaffold.sample.server"},exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.scaffold.sample.server.dao")
@EnableDiscoveryClient
@EnableEurekaClient
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class SampleServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleServerApplication.class, args);
    }

}
