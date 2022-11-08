package com.zc.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author zheng.javagodfather
 * @create 2022-11-08 22:27
 */
@Component
public class paymentFollbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "ok错误";
    }

    @Override
    public String paymentInfo_Out(Integer id) {
        return "timeOut错误";
    }
}
