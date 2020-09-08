package com.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 定义FeignClient服务接口
 * 这里的 name="customer-server" 是注册到Eureka中的要调用的应用名,对应的工程为：EurekaCustomer
 */
@FeignClient(name = "customer-server")
public interface FeignService {

    @GetMapping("/index")
    public String getFeignCustomerInfo();
}
