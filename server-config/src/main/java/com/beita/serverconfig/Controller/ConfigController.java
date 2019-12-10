package com.beita.serverconfig.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${}")
    String beita;

    @GetMapping("/config")
    public String getConfig(){
        return beita;
    }


}



