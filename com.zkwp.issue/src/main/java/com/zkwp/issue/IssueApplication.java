package com.zkwp.issue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther zhangkun
 * @date 2020/2/15 10:44
 **/
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.zkwp.issue.dao")
public class IssueApplication {
    public static void main(String[] args) {
        SpringApplication.run(IssueApplication.class);
    }
}
