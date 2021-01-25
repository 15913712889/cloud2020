package cao.caixiaobai.springcloud.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/25
 * time: 11:54
 * describe(描述): 热点key，返回类
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public class HotKeyException {

    public static String HotKeyET(String a, String b, BlockException e){
        return "服务器繁忙！";
    }
}
