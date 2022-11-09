package com.zc.springcloud.controller;

import com.zc.springcloud.entities.CommonResult;
import com.zc.springcloud.entities.Payment;
import com.zc.springcloud.service.PaymentService;
import com.zc.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zheng.javagodfather
 * @create 2022-11-06 19:50
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("****插入结果*****:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功,端口号为:"+serverPort, result);
        } else {
            return new CommonResult(444, "插入数据失败,端口号为:"+serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果*****:" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,端口号为:"+serverPort, payment);
        } else {
            return new CommonResult(444, "查询失败,没有对应记录，查询ID为:" + id, null);
        }

    }

    @GetMapping("/payment/server")
    public String getPaymentServerPort(){
        return serverPort;
    }

    @GetMapping("/payment/zipkin")
    public String paymentZipkin(){
        return "zipkin,hello";
    }
}
