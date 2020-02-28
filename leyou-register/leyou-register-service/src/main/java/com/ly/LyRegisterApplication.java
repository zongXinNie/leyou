package com.ly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Nie ZongXin
 * @date 2020/2/27 21:51
 */
@SpringBootApplication
@EnableEurekaServer
public class LyRegisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyRegisterApplication.class,args);
    }
}
