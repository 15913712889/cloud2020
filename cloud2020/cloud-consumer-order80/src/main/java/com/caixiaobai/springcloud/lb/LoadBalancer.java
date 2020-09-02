package com.caixiaobai.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @作者: caixiaobai
 * @时间：2020/7/16
 **/
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> instances);
}
