package com.zc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateRequestCustomizer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zheng.javagodfather
 * @create 2022-11-07 18:44
 */
@RestController
@Slf4j
public class OrderZkController {
    private static final String NIVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(NIVOKE_URL+"/payment/zk",String.class);
        return result;
    }
}
