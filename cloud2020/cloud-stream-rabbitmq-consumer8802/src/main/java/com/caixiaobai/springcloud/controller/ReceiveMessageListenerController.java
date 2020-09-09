package com.caixiaobai.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;


/**
 * @作者: caixiaobai
 * @时间：2020/09/08
 **/
@Component
@EnableBinding(Sink.class)//这个是import org.springframework.cloud.stream.messaging.Sink;下的包
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    //Message是import org.springframework.messaging.Message;包下的
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("=====消费者1号,-->接受到的消息："+message.getPayload()+"\t port:"+serverPort);
    }
}
