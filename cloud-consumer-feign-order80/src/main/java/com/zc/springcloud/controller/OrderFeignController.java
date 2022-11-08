package com.zc.springcloud.controller;

import com.zc.springcloud.entities.CommonResult;
import com.zc.springcloud.entities.Payment;
import com.zc.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zheng.javagodfather
 * @create 2022-11-08 16:19
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {

        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/create")
    public CommonResult create(@RequestBody Payment payment) {

        return paymentFeignService.create(payment);

    }
}
