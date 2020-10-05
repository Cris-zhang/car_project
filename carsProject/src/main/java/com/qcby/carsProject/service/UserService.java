package com.qcby.carsProject.service;

import com.qcby.carsProject.entity.TCar;

import java.util.List;
import java.util.Map;

public interface UserService {
    public boolean login(String userName,String password);

    public  boolean register(String userName,String password);

    public List<TCar> selCar(Map<String,Object> map);
}
