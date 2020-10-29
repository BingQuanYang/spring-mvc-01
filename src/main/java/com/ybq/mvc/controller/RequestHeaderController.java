package com.ybq.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestHeaderController {


    /**
     * 请求头传数据
     * 应用场景
     * 认证  jwt     替换session   cookie
     *
     * @param token
     * @return
     */
    @GetMapping("/h1")
    @ResponseBody
    public String test1(@RequestHeader String token){
        System.out.println(token);
        return "@RequestHeader的使用请求头传递参数";
    }

    @GetMapping("/h2")
    @ResponseBody
    public String test2(@CookieValue("CK") String cookie){
        System.out.println(cookie);
        return "CookieValue的使用Cookie传递参数";
    }
}
