package com.xjt.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tao
 * @since 2019/8/26 18:47
 */
@FeignClient(value = "eureka-client", fallback = FeignHystrixService.class)
public interface FeignService {

    @RequestMapping("/ribbon")
    String helloCallBack();
}
