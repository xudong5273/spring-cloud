package com.beita.servicefeign.Feign.Impl;

import com.beita.servicefeign.Feign.FeignService;


import org.springframework.stereotype.Component;

@Component
public class FeignServiceImpl implements FeignService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
