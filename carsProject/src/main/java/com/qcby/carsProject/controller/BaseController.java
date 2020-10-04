package com.qcby.carsProject.controller;

import com.google.gson.Gson;

public class BaseController {
    private Gson gson = new Gson();

    public String getJson(Object object){
        return gson.toJson(object);
    }
}
