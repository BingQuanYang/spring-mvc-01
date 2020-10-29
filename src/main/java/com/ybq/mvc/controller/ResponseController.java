package com.ybq.mvc.controller;

import com.ybq.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST 定义路径    路径尽量使用名称
 * api/v1/user/list?page=1&size=10  get 获取数据
 * api/v1/user/list/1/10
 * 移动
 * 前端   +   后台  +   数据库  +   部署
 * 后台   +  前端   +   iOS    +    安卓  +  后台
 * <p>
 * RPC  dubbo
 * REST 微服务 spring  cloud
 * <p>
 * <p>
 * 前后端不分离 @Controller + @ResponseBody
 * 前后端分离的   @RestController
 */
//@Controller
@RestController
@RequestMapping("/user1")
public class ResponseController {
    /**
     * mapping 声明  {变量名}
     * 在参数中使用   @PathVariable 注解
     *
     * @param id
     * @return
     */
    @GetMapping("/detail/{id}")
    public User detail(@PathVariable int id) {
        System.out.println(id);
        return new User();
    }

    //list/1/10
    @GetMapping("/list/{page}/{size}")
    public String list(@PathVariable int page, @PathVariable int size) {
        System.out.println(page);
        System.out.println(size);
        return "动态路径";
    }
}
