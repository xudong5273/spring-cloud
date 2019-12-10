package com.beita.eurekaclienttest.ConfigController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${beita}")
    String beita;

    @GetMapping("/config")
    public String getConfig(){
        return beita;
    }


}

