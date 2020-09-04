package com.caixiaobai.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @作者: caixiaobai
 * @时间：2020/09/04
 **/
@Component
@Slf4j
public class MyLogGloBalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("=====come in MyLogGloBalFilter:"+new Date());
        //ServerWebExchange exchange   是spring5.0之后的东西，需要了解
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if(uname == null){
            log.info("======用户名为null，非法用户！");
            //设置了一个响应转态码为不被接受的
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        //将我们的这个判断返回出去
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;//返回的数字越小优先级越高
    }
}
