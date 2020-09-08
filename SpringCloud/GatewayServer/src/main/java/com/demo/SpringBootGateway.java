package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

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
public class SpringBootGateway {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGateway.class, args);
	}
}
