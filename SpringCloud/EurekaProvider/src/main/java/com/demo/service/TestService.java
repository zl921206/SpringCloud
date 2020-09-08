package com.demo.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 测试服务
 */
@Service
public class TestService {

    public String test(){
        System.out.println("执行TestService.test()......");
        return "Hello World ！" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
