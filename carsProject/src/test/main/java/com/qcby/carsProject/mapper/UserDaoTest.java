package main.java.com.qcby.carsProject.mapper;

import com.qcby.carsProject.mapper.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class UserDaoTest {

    @Autowired
    UserDao userDao;
    @Test
    public void selectBycarModel() {
        userDao.selectBycarModel("123","123");
    }
}