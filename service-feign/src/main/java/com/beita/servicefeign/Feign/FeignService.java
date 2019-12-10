package com.beita.servicefeign.Feign;

import com.beita.servicefeign.Feign.Impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//要调用的远程服务名,出现故障调用FeignServiceImpl的方法
@FeignClient(value = "eureka-client",fallback = FeignServiceImpl.class)

//要调用的远程服务名
//@FeignClient(value = "eureka-client")
public interface FeignService {

    ////要调用的远程服务接口
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
