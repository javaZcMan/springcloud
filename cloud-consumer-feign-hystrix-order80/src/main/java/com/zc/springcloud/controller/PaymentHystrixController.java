package com.zc.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zc.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zheng.javagodfather
 * @create 2022-11-08 21:08
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "timeOut")
public class PaymentHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentInfo_Ok(id);
    }

    //@HystrixCommand(fallbackMethod = "paymentInfo_OutHandler",commandProperties ={
    //        @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "6000")
    //})
    @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/out/{id}")
    public String paymentInfo_Out(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentInfo_Out(id);
    }

    public String paymentInfo_OutHandler(Integer id){

        return "客户端系统繁忙，请稍后再试:"+id;
    }

    public String timeOut(){

        return "客户端系统繁忙，****请稍后再试:";
    }

}
