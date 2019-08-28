package com.xjt.eurekaconsume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tao
 * @since 2019/8/14 14:30
 */
@RestController
public class ComsumeController {

    @Autowired
    private LoadBalancerClient client;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consume")
    public String consumer() {
        ServiceInstance serviceInstance = client.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hello";
        String dc = restTemplate.getForObject(url, String.class);
        return dc;
    }
}
