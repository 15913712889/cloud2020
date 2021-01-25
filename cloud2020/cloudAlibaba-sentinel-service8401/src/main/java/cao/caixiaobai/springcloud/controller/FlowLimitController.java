package cao.caixiaobai.springcloud.controller;


import cao.caixiaobai.springcloud.exception.HotKeyException;
import com.alibaba.csp.sentinel.annotation.SentinelResource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/19
 * time: 16:05
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@RestController
public class FlowLimitController {
    @RequestMapping("/testDemo01")
    public String dome01(){
        return "-----testDemo01";
    }

    @RequestMapping("/testDemo02")
    public String demo02(){
        return "-----testDemo02";
    }

    @RequestMapping("/testDemo03")
    public String demo03(Integer i) {
        if(i.equals(1)) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "线程名："+Thread.currentThread().getName()+",时间："+dateformat.format(System.currentTimeMillis());
    }



    @RequestMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler ="HotKeyET",blockHandlerClass = HotKeyException.class)
    public String hotKey(@RequestParam(value = "a",required = false)String a,
                         @RequestParam(value = "b",required = false)String b){

        return "正常方法返回！";
    }

}
