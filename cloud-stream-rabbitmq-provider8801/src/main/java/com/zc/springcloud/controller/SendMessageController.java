package com.zc.springcloud.controller;

import com.zc.springcloud.service.MyMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zheng.javagodfather
 * @create 2022-11-10 0:36
 */
@RestController
public class SendMessageController {
    @Resource
    private MyMessageProvider myMessageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return myMessageProvider.send();
    }
}
