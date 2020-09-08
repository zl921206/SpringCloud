package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Spring Boot 启动类
 * @author Administrator
 *
 */
@SpringBootApplication
/**
 * 启用Eureka客户端功能
 */
@EnableEurekaClient
/**
 * 增加Feign支持
 */
@EnableFeignClients
public class SpringBootProvider {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProvider.class, args);
	}
}
