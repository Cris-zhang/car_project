package com.qcby.carsProject.controller;

import com.qcby.carsProject.entity.Base.ReturnModel;
import com.qcby.carsProject.entity.TUser;
import com.qcby.carsProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    String path = "";

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String login(@RequestParam("username")String username,@RequestParam("password")String password) {
        System.out.println("登录方法入参：userName = " + username + "  password = " + password);
        boolean login = userService.login(username, password);
        ReturnModel returnModel = new ReturnModel();
        if(login){
            return this.getJson(returnModel);
        }else {
            returnModel.error("用户名或密码错误！");
            return this.getJson(returnModel);
        }
    }

    @RequestMapping(value = "/register",produces ="text/html;charset=UTF-8")
    @ResponseBody
        public  String register(@RequestParam("username") String username,@RequestParam("password")String password){
        System.out.println("注册方法入参：userName = "+username+"password = "+password);
        boolean register = userService.register(username,password);
        ReturnModel returnModel = new ReturnModel();
        if (register){
            return  this.getJson(returnModel);
        }else {
            returnModel.error("该账号已存在");
            return  this.getJson(returnModel);
        }
    }
    /**
     *
     * @return json格式字符串
     */
    @RequestMapping("/test")
    @ResponseBody
    public String test(){

        ReturnModel<TUser> returnModel = new ReturnModel();
//        returnModel.setData(new TUser());
        returnModel.error("用户名错误！");
        return this.getJson(returnModel);
    }
}
