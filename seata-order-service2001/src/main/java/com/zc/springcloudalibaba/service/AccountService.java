package com.zc.springcloudalibaba.service;

import com.zc.springcloudalibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author zheng.javagodfather
 * @create 2022-11-12 0:26
 */
@FeignClient("seata-account-service")
public interface AccountService {

     @PostMapping("/account/decrease/{userId}/{money}")
     CommonResult decrease(@PathVariable("userId") Long userId, @PathVariable("money") BigDecimal money);
}
