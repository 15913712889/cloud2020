package cao.caixiaobai.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
