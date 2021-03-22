package com.caixiaobai.springcloud.controller;

import com.caixiaobai.springcloud.result.CommonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/19
 * time: 13:27
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@Controller
public class TestController {

    @RequestMapping(value = "/testDemo01")
    @ResponseBody
    public String demo01(){
        return "demo01";
    }

    @RequestMapping(value = "/")
    @ResponseBody
    public CommonResult demo02(){
        return new CommonResult(200,"测试成功！");
    }

}
