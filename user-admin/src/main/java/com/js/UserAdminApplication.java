package com.js;

import com.js.util.StartLogo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class UserAdminApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(UserAdminApplication.class, args);
            log.info(StartLogo.print());
            log.info("项目启动成功");
        } catch (Exception e) {
            log.info("项目启动失败");
        }
    }

}
