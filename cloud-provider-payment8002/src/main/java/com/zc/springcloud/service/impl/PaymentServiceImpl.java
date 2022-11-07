package com.zc.springcloud.service.impl;

import com.zc.springcloud.dao.PaymentDao;
import com.zc.springcloud.entities.Payment;
import com.zc.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zheng.javagodfather
 * @create 2022-11-06 19:47
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    /**
     * @param payment
     * @return 新增一个数据
     */
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    /**
     * @param id
     * @return 根据id查询一个数据
     */
    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
