package com.zc.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zc.springcloud.entities.CommonResult;
import com.zc.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author zheng.javagodfather
 * @create 2022-11-10 23:22
 */
@RestController
@Slf4j
public class ServiceController {
    @GetMapping("/testA")
    public String testA() {
        log.info(Thread.currentThread().getName() + "******testA");
        return "*************testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "*************testB";
    }

    @GetMapping("/testD")
    public String testD() {
        int a = 10 / 0;
        log.info("****testD");
        return "*************testD";
    }

    @GetMapping("/testE")
    @SentinelResource(value = "testE", blockHandler = "fix_testE")
    public String testE(@RequestParam(value = "p1", required = false) String p1,
                        @RequestParam(value = "p2", required = false) String p2) {

        return "**********testE";
    }

    public String fix_testE(String p1, String p2, BlockException exception) {
        return "限流";
    }



}
