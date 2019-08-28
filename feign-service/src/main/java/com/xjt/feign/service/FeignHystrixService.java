package com.xjt.feign.service;

import org.springframework.stereotype.Service;

/**
 * @author Tao
 * @since 2019/8/26 18:58
 */
@Service
public class FeignHystrixService implements FeignService {


    /**
     * 降级后执行的方法体
     * @return
     */
    @Override
    public String helloCallBack() {
        return "service error!";
    }
}
