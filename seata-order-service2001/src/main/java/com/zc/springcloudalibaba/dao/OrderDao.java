package com.zc.springcloudalibaba.dao;

import com.zc.springcloudalibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zheng.javagodfather
 * @create 2022-11-12 0:02
 */
@Mapper
public interface OrderDao {

    //新建订单
    void create(Order order);

    //修改订单状态，从0到1
    void update(@Param("userId") Long userId,@Param("status") Integer status);

}
