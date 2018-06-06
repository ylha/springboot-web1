package com.springsession.springsession.springtestsession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SessionController {

    // 用于测试 SpringBoot 容器是否启动
    // http:localhost:8080/test
    @RequestMapping("/test")
    public String test(){
        return "PING OK";
    }

    // http:localhost:8080/put?key=name&value=liwei
    @RequestMapping("/put")
    public String put(HttpSession session,
                      @RequestParam("key") String key, @RequestParam("value") String value){
        session.setAttribute(key,value);

        return "PUT OK";
    }

    // http:localhost:8080/get?key=name
    @RequestMapping("/get")
    public String get(HttpSession session,
                      @RequestParam("key") String key){
        String value = (String) session.getAttribute(key);

        if(value == null || "".equals(value)){
            return "NO VALUE GET";
        }
        return value;
    }

}