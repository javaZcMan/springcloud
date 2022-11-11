package com.zc.springcloudalibaba.controller;

import com.zc.springcloudalibaba.domain.CommonResult;
import com.zc.springcloudalibaba.domain.Order;
import com.zc.springcloudalibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zheng.javagodfather
 * @create 2022-11-12 0:45
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"创建订单成功");
    }
}
