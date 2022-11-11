package com.zc.springcloudalibaba.controller;

import com.zc.springcloudalibaba.domain.CommonResult;
import com.zc.springcloudalibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zheng.javagodfather
 * @create 2022-11-12 1:44
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease/{productId}/{count}")
    public CommonResult decrease(@PathVariable("productId") Long productId,@PathVariable("count") Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }

}
