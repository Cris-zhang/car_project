package com.qcby.carsProject.mapper;

import com.qcby.carsProject.entity.TCar;
import com.qcby.carsProject.entity.TUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    TUser selectByUserName(@Param("userName") String userName);

    public boolean insertByUserName( @Param("userName") String userName,@Param("password") String password);

    List<TCar> selectBycarModel();
}
