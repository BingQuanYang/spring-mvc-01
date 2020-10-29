package com.ybq.mvc.controller;

import com.ybq.mvc.dto.UserRequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RequestParamController {
    /**
     * 大型的项目   java
     * user_name
     */
    @GetMapping("/test1")
    @ResponseBody
    public String test1(@RequestParam(value = "user_name") String username) {
        System.out.println(username);
        return "RequestParam注解的使用";
    }

    @GetMapping("/test2")
    @ResponseBody
    /***
     * RequestParam
     * 属性
     * value    当客户端的参数跟方法的参数不一致的时候可以使用
     * required 默认为true 表示必传参数
     * defaultValue 给参数赋默认值
     */
    public String test2(@RequestParam(value = "username", required = false) String name, @RequestParam(required = false, defaultValue = "1") int page, @RequestParam(required = false, defaultValue = "10") int size) {
        System.out.println("名字" + name);
        System.out.println("page" + page);
        System.out.println("size" + size);
        return "RequestParam注解的使用给默认值";
    }

    /**
     *
     * 传参尽量不要使用map
     * @return
     */
    @PostMapping("/test3")
    @ResponseBody
    public String test3(@RequestBody UserRequestParam param) {
        System.out.println(param);
        return "RequestBody注解的使用";
    }

}
