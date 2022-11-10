package com.zc.springcloualibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zheng.javagodfather
 * @create 2022-11-10 15:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaNacosMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosMain9002.class,args);
    }
}
