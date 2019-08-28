package com.xjt.feign.controller;

import com.xjt.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tao
 * @since 2019/8/26 18:50
 */
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @RequestMapping("/feignHello")
    public String feignHello(){
        return feignService.helloCallBack();
    }
}
