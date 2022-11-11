package com.zc.springcloudalibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zheng.javagodfather
 * @create 2022-11-12 1:40
 */
public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease(Long productId,Integer count);
}
