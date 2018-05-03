package com.git.wkm.service;

import org.springframework.stereotype.Component;

/**
 * Created by wangkaimeng on 2018/5/2.
 */
@Component
public class FeighServiceHystric implements FeignService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
