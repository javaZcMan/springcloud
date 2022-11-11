package com.zc.springcloudalibaba.controller;

import com.zc.springcloudalibaba.domain.CommonResult;
import com.zc.springcloudalibaba.service.AccountService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author zheng.javagodfather
 * @create 2022-11-12 2:14
 */
@RestController
public class AccountController {
    @Resource
    private AccountService accountService;

    /**
     * 扣减账户余额
     */
    @RequestMapping("/account/decrease/{userId}/{money}")
    public CommonResult decrease(@PathVariable("userId") Long userId, @PathVariable("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "扣减账户余额成功！");
    }

}
