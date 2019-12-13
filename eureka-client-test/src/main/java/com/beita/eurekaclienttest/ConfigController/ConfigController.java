package com.beita.eurekaclienttest.ConfigController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    http://localhost:8881/actuator/bus-refresh
    http://localhost:8881/actuator/bus-refresh?destination=customers:**
    /actuator/bus-refresh接口可以指定服务，即使用"destination"参数，比如 “/actuator/bus-refresh?destination=customers:**” 即刷新服务名为customers的所有服务
 */
@RefreshScope
@RestController
public class ConfigController {

    @Value("${beita}")
    String beita;

    @GetMapping("/config")
    public String getConfig(){
        return beita;
    }


}

