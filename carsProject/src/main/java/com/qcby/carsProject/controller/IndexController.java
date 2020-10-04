package com.qcby.carsProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "/login";
    }
    @RequestMapping("/test")
    public String test(){
        return "/test";
    }
}
