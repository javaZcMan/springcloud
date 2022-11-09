package com.zc.springcloud.service.impl;

import com.zc.springcloud.service.MyMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author zheng.javagodfather
 * @create 2022-11-10 0:28
 */
@EnableBinding(Source.class)
public class MyMessageProviderImpl implements MyMessageProvider {

    //消息发送管道
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*********************"+serial);
        return "gcfct";
    }
}
