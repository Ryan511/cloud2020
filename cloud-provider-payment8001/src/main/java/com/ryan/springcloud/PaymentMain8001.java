package com.ryan.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author zhongziqi
 * @date :2021/9/15 0:23
 * Desc:
 */

@EntityScan(basePackages = {"com.ryan.springcloud"})
@MapperScan(basePackages = {"com.ryan.springcloud.module.mapper"})
@SpringBootApplication
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
