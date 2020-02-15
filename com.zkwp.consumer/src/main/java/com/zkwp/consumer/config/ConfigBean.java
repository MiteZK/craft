package com.zkwp.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zhangkun
 * @date 2020/2/15 12:01
 **/
@Configuration
public class ConfigBean {


    @Bean
    @LoadBalanced
    public RestTemplate getTemplate() {  //RestTemplate
        return new RestTemplate();
    }


    @Bean
    public IRule myRule(){
        return new RandomRule();  //ribbon  的负载均衡算法
    }
}
