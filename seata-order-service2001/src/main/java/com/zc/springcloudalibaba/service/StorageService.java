package com.zc.springcloudalibaba.service;

import com.zc.springcloudalibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author zheng.javagodfather
 * @create 2022-11-12 0:26
 */
@FeignClient("seata-storage-service")
public interface StorageService {
    @PostMapping("/storage/decrease/{productId}/{count}")
    CommonResult decrease(@PathVariable("productId") Long productId, @PathVariable("count") Integer count);
}
