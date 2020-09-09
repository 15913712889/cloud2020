package com.caixiaobai.springcloud.service.impl;

import com.caixiaobai.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @作者: caixiaobai
 * @时间：2002/09/08
 **/
//@Service      这个service是跟rabbitMQ打交道的可以不需要使用@service注解
@EnableBinding(Source.class)  //定义生成者消息的发送管道,引入的Source.class是Stream下面的包，不要引入错误
@Slf4j
public class MessageProviderImpl implements IMessageProvider {

    @Autowired
    private MessageChannel output;//消息发送管道

    @Override
    public String send() {

        String serial = UUID.randomUUID().toString(); //流水号
        //MessageBuilder是import org.springframework.messaging.support.MessageBuilder;包下的
        output.send(MessageBuilder.withPayload(serial).build());

        log.info("=====serial:"+serial);
        return null;
    }
}
