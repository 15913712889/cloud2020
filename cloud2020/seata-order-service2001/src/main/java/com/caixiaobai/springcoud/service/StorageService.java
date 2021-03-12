package com.caixiaobai.springcoud.service;

import com.caixiaobai.springcoud.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/12
 * time: 10:28
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @PostMapping("storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,
                          @RequestParam("count") Integer count);
}
