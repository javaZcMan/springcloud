package com.zc.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zc.springcloudalibaba.service.PaymentService;
import com.zc.springcloud.entities.CommonResult;
import com.zc.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zheng.javagodfather
 * @create 2022-11-11 1:48
 */
@RestController
public class OrderController {
    public static final String SERVICE_URL = "http://nacos-payment-provider";

    @Resource
    private PaymentService paymentService;
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/fallback/{id}")
    @SentinelResource(value = "fallback",
            blockHandler = "Exception2",
            fallback = "Exception1",
            exceptionsToIgnore = {IllegalArgumentException.class})
    public CommonResult<Payment> fallback(@PathVariable Long id) {
        CommonResult<Payment> result = restTemplate.getForObject(SERVICE_URL + "/paymentSQL/" + id, CommonResult.class, id);

        if (id == 4) {
            throw new IllegalArgumentException("IllegalArgumentException,非法参数异常....");
        } else if (result.getData() == null) {
            throw new NullPointerException("NullPointerException,该ID没有对应记录,空指针异常");
        }

        return result;
    }

    public CommonResult Exception1(@PathVariable Long id, Throwable e) {
        return new CommonResult(444, "java代码异常,方法1处理" + e.getMessage(), null);
    }

    public CommonResult Exception2(@PathVariable Long id, BlockException exception) {
        return new CommonResult(444, "sentinel处理异常,方法2处理" + exception.getMessage(), null);
    }

    @GetMapping("/consumer/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        return paymentService.paymentSQL(id);
    }

}
