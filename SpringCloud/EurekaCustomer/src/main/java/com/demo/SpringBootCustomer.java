package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Spring Boot 启动类
 * @author Administrator
 */
@SpringBootApplication
/**
 * 开启发现服务
 * @desc @EnableEurekaClient 和 @EnableDiscoveryClient 都是让eureka发现该服务并注册到eureka上的注解
 * 相同点：都能让注册中心Eureka发现，并将该服务注册到注册中心上；
 * 不同点：@EnableEurekaClient只适用于Eureka作为注册中心，而@EnableDiscoveryClient可以是其他注册中心；
 */
@EnableDiscoveryClient
public class SpringBootCustomer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomer.class, args);
	}

	/**
	 * Ribbon使用
	 * 启用负载均衡，默认算法是轮询，也可以自定义RibbonClient
	 * @return RestTemplate
	 */
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
