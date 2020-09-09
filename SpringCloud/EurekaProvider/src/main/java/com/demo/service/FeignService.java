package com.demo.service;

import com.demo.fallback.FeignApiFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 定义FeignClient服务接口
 * 这里的 name="customer-server" 是注册到Eureka中的要调用的应用名,对应的工程为：EurekaCustomer
 * fallback : 当customer-server服务不可用时，执行FeignApiFallBack
 */
@FeignClient(name = "customer-server", fallback = FeignApiFallBack.class)
public interface FeignService {

    @GetMapping("/index")
    public String getFeignCustomerInfo();
}
