package com.beita.eurekaclient.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String home(@RequestParam(value = "name", defaultValue = "贝塔") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
