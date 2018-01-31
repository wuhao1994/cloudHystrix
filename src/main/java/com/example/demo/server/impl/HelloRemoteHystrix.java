package com.example.demo.server.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.server.HelloRemote;
/**
 * Created by 格讯科技有限公司 on 2018/1/31.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" +name+", this messge send failed ";
    }
}