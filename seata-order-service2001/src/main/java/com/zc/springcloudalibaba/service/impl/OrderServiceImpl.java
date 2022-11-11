package com.zc.springcloudalibaba.service.impl;

import com.zc.springcloudalibaba.dao.OrderDao;
import com.zc.springcloudalibaba.domain.Order;
import com.zc.springcloudalibaba.service.AccountService;
import com.zc.springcloudalibaba.service.OrderService;
import com.zc.springcloudalibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zheng.javagodfather
 * @create 2022-11-12 0:27
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    @Override
    @GlobalTransactional(name = "zc-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("---------->开始新建订单");
        orderDao.create(order);

        log.info("---------->订单微服务调用库存,扣数量");
        storageService.decrease(order.getProductId(),order.getCount());

        log.info("---------->订单微服务调用账户,扣钱");
        accountService.decrease(order.getUserId(),order.getMoney());

        log.info("---------->修改订单状态");
        orderDao.update(order.getUserId(),0);

        log.info("---------->订单结束");

    }
}
