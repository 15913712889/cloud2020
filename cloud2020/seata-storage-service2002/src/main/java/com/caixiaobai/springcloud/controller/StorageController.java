package com.caixiaobai.springcloud.controller;

import com.caixiaobai.springcloud.result.CommonResult;
import com.caixiaobai.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/15
 * time: 11:37
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    //扣减库存
    @RequestMapping(value = "/storage/decrease")
    public CommonResult decrease( Long productId,
                                 Integer count){
        storageService.decrease(productId,count);
        return new CommonResult(200,"扣减库存成功！");
    }

}
