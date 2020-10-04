package com.qcby.carsProject.mapper;

import com.qcby.carsProject.entity.TUser;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    TUser selectByUserName(@Param("userName") String userName);

    public boolean insertByUserName( @Param("userName") String userName,@Param("password") String password);

    public  boolean selectBycarModel(@Param("userid") String userid,@Param("id") String id);
}
