package com.caixiaobai.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @作者: caixiaobai
 * @时间：2020/7/16
 **/
@Configuration//被spring扫描
public class MySelfRule {

    @Bean//加入容器
    public IRule myRule(){
        return new RandomRule();//定义规则为随机
    }
}
