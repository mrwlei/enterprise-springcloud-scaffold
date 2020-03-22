package com.scaffold.eureka.server7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer服务器端启动类，接受其它微服务注册进来
 * @author leiwa
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001Application.class, args);
    }

}
