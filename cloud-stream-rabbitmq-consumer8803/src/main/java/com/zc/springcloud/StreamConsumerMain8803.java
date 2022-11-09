package com.zc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zheng.javagodfather
 * @create 2022-11-10 1:27
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StreamConsumerMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerMain8803.class,args);
    }
}
