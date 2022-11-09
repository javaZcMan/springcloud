package com.zc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zheng.javagodfather
 * @create 2022-11-09 22:43
 */
@RestController
@RefreshScope
public class ClientController {
    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configMessage;

    @GetMapping("/configInfo")
    public String getConfigMessage(){
        return "端口号:"+serverPort+"***configMessage:"+configMessage;
    }

}
