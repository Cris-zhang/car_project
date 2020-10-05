package com.qcby.carsProject.service.impl;

import com.qcby.carsProject.entity.TCar;
import com.qcby.carsProject.entity.TUser;
import com.qcby.carsProject.mapper.UserDao;
import com.qcby.carsProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean login(String userName, String password) {
        TUser user = userDao.selectByUserName(userName);

        if(user != null && user.getPassWord() != null){
            if(user.getPassWord().equals(password)){
                return true;
            }
        }

        return false;
    }
    @Override
    public boolean register(String userName, String password){
        Boolean re = userDao.insertByUserName(userName,password);
        if (re) return true;
        else  return false;

    }

    public List<TCar> selCar(Map<String,Object> map){
        return this.userDao.selectBycarModel();
    }
}
