package com.ybq.mvc.controller;

import com.ybq.mvc.entity.User;
import com.ybq.mvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 一个控制器 一般就是一个功能模块
 *
 *
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {
  /*  @Resource
    UserService userService;*/

    /**
     *
     * REST 风格
     * get select
     * post insert
     * put  update
     * delete   delete
     * @return
     */
    @RequestMapping(value = "/list",method = {RequestMethod.GET,RequestMethod.POST},params = {"id"},consumes = "appliction/json",produces = "image/png")
    @ResponseBody
    public List<User> users(){
        return new ArrayList<>();
    }
    @GetMapping("/info")
    @ResponseBody
    public User user(){
        return new User();
    }

    /**
     * 如何解释参数
     *  1、接收基本类型的参数
     *
     */


}
