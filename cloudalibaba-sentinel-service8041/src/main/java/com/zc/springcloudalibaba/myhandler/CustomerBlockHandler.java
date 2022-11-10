package com.zc.springcloudalibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zc.springcloud.entities.CommonResult;
import com.zc.springcloud.entities.Payment;

/**
 * @author zheng.javagodfather
 * @create 2022-11-11 1:16
 */

public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "自定义的方法1", new Payment(2L, "sb"));
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "自定义的方法2", new Payment(2L, "sb"));
    }
}
