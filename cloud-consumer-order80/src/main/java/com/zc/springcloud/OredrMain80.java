package com.zc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zheng.javagodfather
 * @create 2022-11-06 21:29
 */
@SpringBootApplication
@EnableEurekaClient
public class OredrMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OredrMain80.class,args);
    }
}
