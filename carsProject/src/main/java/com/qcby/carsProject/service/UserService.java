package com.qcby.carsProject.service;

public interface UserService {
    public boolean login(String userName,String password);

    public  boolean register(String userName,String password);
}
