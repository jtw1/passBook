package com.project.passbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description 测试用例入口
 * @date 2021/6/20-16:22
 */
@SpringBootApplication
@MapperScan("com/project/passbook/dao")
public class MerchantsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MerchantsApplication.class,args);
    }
}
