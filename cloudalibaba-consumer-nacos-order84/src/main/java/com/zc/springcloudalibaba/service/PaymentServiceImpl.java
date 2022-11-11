package com.zc.springcloudalibaba.service;

import com.zc.springcloud.entities.CommonResult;
import com.zc.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author zheng.javagodfather
 * @create 2022-11-11 2:41
 */
@Component
public class PaymentServiceImpl implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回",null);
    }
}
