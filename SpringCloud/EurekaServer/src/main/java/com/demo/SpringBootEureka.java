package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Spring Boot 启动类
 * @author Administrator
 */
@SpringBootApplication
/**
 * 启用Eureka注册中心
 */
@EnableEurekaServer
public class SpringBootEureka {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEureka.class, args);
	}
}
