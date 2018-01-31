package com.example.demo.server;

import com.example.demo.server.impl.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 格讯科技有限公司 on 2018/1/31.
 */
@FeignClient(name= "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote{
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
