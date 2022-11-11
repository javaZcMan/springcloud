package com.zc.springcloudalibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author zheng.javagodfather
 * @create 2022-11-12 2:09
 */
public interface AccountService {
    /**
     * 扣钱
     * @param userId
     * @param money
     */
    void decrease(Long userId,BigDecimal money);
}
