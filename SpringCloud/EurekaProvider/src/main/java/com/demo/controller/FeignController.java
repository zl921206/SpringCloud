package com.demo.controller;

import com.demo.service.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign客户端信息获取控制器
 */
@RestController
@Slf4j
public class FeignController {

    @Autowired
    private FeignService feignService;

    /**
     * 通过访问该方法，获取执行到EurekaCustomer工程下的控制器CustomerController.index()方法，
     * 由FeignService中定义的Eureka应用名name值决定
     * @return
     */
    @GetMapping("getFeignProviderInfo")
    public String getFeignProviderInfo() {
        String result = feignService.getFeignCustomerInfo();
        log.info("result：{}", result);
        return result;
    }
}
