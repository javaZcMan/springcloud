package com.zc.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zheng.javagodfather
 * @create 2022-11-10 23:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceMain8401 {
    public static void main(String[] args) {
        SpringApplication.run(ServiceMain8401.class,args);
    }
}
