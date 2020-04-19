package com.shayne.wechat.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shayne.wechat.web.dao")
public class ShayneWechatWebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShayneWechatWebApiApplication.class, args);
    }

}
