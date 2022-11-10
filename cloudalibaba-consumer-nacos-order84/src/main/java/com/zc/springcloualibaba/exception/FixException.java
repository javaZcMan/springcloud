package com.zc.springcloualibaba.exception;

import com.zc.springcloud.entities.CommonResult;
import com.zc.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zheng.javagodfather
 * @create 2022-11-11 2:02
 */
public class FixException {

    public CommonResult Exception1(@PathVariable Long id,Throwable e){
        return new CommonResult(444,"java代码异常,方法1处理"+e.getMessage(),null);
    }

    public CommonResult Exception2(@PathVariable Long id,Throwable e){
        return new CommonResult(444,"java代码异常,方法2处理"+e.getMessage(),null);
    }
}
