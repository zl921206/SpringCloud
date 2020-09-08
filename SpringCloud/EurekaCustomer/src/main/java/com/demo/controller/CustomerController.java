package com.demo.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Set;

/**
 * 消费者控制器
 */
@RestController
public class CustomerController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/index")
    public String index() {
        /**
         * getForObject返回一个对象(服务返回的具体值)
         */
//        restTemplate.getForObject("http://provider-server/test", Object.class);
        /**
         * getForEntity不仅返回具体数据 还可以返回状态码 头信息...
         */
        // 获取服务返回值 http响应码 头信息...
        ResponseEntity<String> resp = restTemplate.getForEntity("http://provider-server/test", String.class);
        String body = resp.getBody();
        System.out.println("body --> " + body);

        HttpStatus statusCode = resp.getStatusCode();
        System.out.println("HttpStatus --> " + statusCode);

        int statusCodeValue = resp.getStatusCodeValue();
        System.out.println("getStatusCodeValue --> " + statusCodeValue);

        System.err.println("----------------------遍历headers----------------------");
        // 需要遍历
        HttpHeaders headers = resp.getHeaders();
        Set<String> strings = headers.keySet();
        for (String s : strings) {
            System.out.println(s + " => " + headers.get(s));
        }
        return resp.getBody();
    }

}
