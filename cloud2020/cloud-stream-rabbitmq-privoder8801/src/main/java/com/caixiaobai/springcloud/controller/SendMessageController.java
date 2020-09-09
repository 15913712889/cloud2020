package com.caixiaobai.springcloud.controller;

import com.caixiaobai.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者: caixiaobai
 * @时间：2020/09/08
 **/
@RestController
public class SendMessageController {
    @Autowired
    private IMessageProvider iMessageProvider;

    @GetMapping(value = "/sendMessage")
    public String SendMessage(){
        return iMessageProvider.send();
    }
}
