package cao.caixiaobai.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/01/19
 * time: 15:53
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class SentinelMain8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelMain8401.class,args);
        log.info("项目启动成功！！！");
    }
}
