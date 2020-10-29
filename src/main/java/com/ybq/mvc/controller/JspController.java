package com.ybq.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {
    @GetMapping("/index")
    public String index(){
        return "user";
    }
}
