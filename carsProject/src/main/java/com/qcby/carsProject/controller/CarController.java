package com.qcby.carsProject.controller;

import com.qcby.carsProject.entity.Base.ReturnModel;
import com.qcby.carsProject.entity.TCar;
import com.qcby.carsProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Car")
public class CarController extends BaseController{
    String path = "";

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selCar",produces="text/html;charset=UTF-8")
    public  String selCar(){
        List<TCar> selCar = userService.selCar();
        model.addAttribute("selCar",selCar);
        ReturnModel returnModel = new ReturnModel();

    }
}
