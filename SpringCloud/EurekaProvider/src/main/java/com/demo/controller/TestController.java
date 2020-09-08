package com.demo.controller;

import com.demo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 生产者测试控制器
 */
@RestController
public class TestController {

    /**
     * 注入测试服务接口
     */
    @Resource
    private TestService testService;

    /**
     * 访问测试方法
     * @return String
     */
    @RequestMapping("/test")
    public String index(){
        return testService.test();
    }
}
