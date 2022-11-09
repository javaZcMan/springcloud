package com.zc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zheng.javagodfather
 * @create 2022-11-10 1:09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StreamConsumerMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerMain8802.class,args);
    }
}
