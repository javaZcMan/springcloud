package com.zc.springcloud.service;

import com.zc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author zheng.javagodfather
 * @create 2022-11-06 19:46
 */
public interface PaymentService {
    /**
     * @param payment
     * @return 新增一个数据
     */
    public int create(Payment payment);

    /**
     * @param id
     * @return 根据id查询一个数据
     */
    public Payment getPaymentById(@Param("id") Long id);
}
