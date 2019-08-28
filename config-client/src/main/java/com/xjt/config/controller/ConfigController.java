package com.xjt.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tao
 * @since 2019/8/27 16:19
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${user}")
    String user;

    @RequestMapping("/user")
    public String home() {
        return "user:" + user;
    }
}
