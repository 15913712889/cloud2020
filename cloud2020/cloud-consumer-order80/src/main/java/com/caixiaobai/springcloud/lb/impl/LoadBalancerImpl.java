package com.caixiaobai.springcloud.lb.impl;

import com.caixiaobai.springcloud.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @作者: caixiaobai
 * @时间：2020/7/16
 **/
@Component
public class LoadBalancerImpl implements LoadBalancer {

    //原子类
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 :current + 1;//2147483647是整型的最大值
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("=====第几次访问,次数"+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> ServiceInstance) {

        int index = getAndIncrement() % ServiceInstance.size();
        return ServiceInstance.get(index);
    }
}
