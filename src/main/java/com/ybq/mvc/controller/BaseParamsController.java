package com.ybq.mvc.controller;

import com.ybq.mvc.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * 如何解释参数
 * 1、接收基本类型的参数
 * 2、对象(简单对象 复杂对象)
 * 3、map、数组、集合（list)
 * 4、日期
 */
@Controller
@RequestMapping("/base")
public class BaseParamsController {

    // 1、接收基本类型的参数
    //xxx/test1?username="zzh"&id=1
    @GetMapping("/test1")
    @ResponseBody
    public String test(String username,int id) {
        System.out.println(username);
        System.out.println(id);
        return username;
    }


    @GetMapping("/test2")
    @ResponseBody
    public String test2(UserDto userDto) {
        System.out.println(userDto);
        return "接收对象参数";
    }

    /**
     * json数据   复杂的对象（嵌套对象建议用json数据去传）
     * @param userDto
     * @return
     */
    @GetMapping("/test3")
    @ResponseBody
    public String test3(UserDto userDto) {
        System.out.println(userDto);
        return "接收嵌套对象参数";
    }

    @GetMapping("/test4")
    @ResponseBody
    public String test4(int[] ids) {
        System.out.println(ids);
        return "接收数组类型参数";
    }


    @GetMapping("/test5")
    @ResponseBody
    public String test5(Map<String,String> map) {
        System.out.println(map);
        return "接收map类型参数";
    }

    /**
     * 必须配合RequestParam 使用 或者封装成对象不用list作为参数
     * @param
     * @return
     */

    @GetMapping("/test6")
    @ResponseBody
    public String test6(UserDto userDto) {
        System.out.println(userDto.getList());
        return "接收list类型参数";
    }

    @GetMapping("/test7")
    @ResponseBody
    public String test7(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, ModelMap modelMap) {
        System.out.println(request);
        return "接收内置对象参数";
    }
}
