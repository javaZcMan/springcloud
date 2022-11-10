package com.zc.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zheng.javagodfather
 * @create 2022-11-10 15:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaNacosOrderMain83 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosOrderMain83.class,args);
    }
}
