package com.beita.serviceribbon.Controler;


import com.beita.serviceribbon.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/ribbon")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
