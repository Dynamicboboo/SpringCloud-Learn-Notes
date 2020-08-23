package com.niu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description ：
 * @Author tj
 * @Date 2020/8/21
 */
@Configuration
public class ConfigBean {
    //配置负载均衡实现
    @Bean
    @LoadBalanced //Ribbon
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

}
