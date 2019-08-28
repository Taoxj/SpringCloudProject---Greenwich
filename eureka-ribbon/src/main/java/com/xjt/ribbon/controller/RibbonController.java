package com.xjt.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tao
 * @since 2019/8/26 16:24
 */
@RestController
public class RibbonController {

    @Autowired
    private LoadBalancerClient client;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/ribbonConsume")
    public String consumer(){
        String dc = restTemplate.getForObject("http://eureka-client/hello",String.class);
        return dc;
    }
}
