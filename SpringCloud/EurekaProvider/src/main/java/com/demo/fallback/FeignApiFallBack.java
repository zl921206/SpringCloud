package com.demo.fallback;

import com.demo.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * 当FeignService中的customer-server服务不可用时，执行断路器FeignApiFallBack回调方法getFeignCustomerInfo
 * 实现了 FeignService 接口，提供熔断时对应的方法
 */
@Component
public class FeignApiFallBack implements FeignService {

    @Override
    public String getFeignCustomerInfo() {
        return "customer-server invoke fail......";
    }
}
