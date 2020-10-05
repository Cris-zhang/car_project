package main.java.com.qcby.carsProject.mapper;

import com.qcby.carsProject.mapper.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//表示使用自己定制的Junit4.5+运行器来运行测试，即完成Spring TestContext框架与Junit集成；
@RunWith(SpringJUnit4ClassRunner.class)

public class UserDaoTest {

    @Autowired
    UserDao userDao;
    @Test
    public void selectBycarModel() {
        userDao.selectBycarModel();
    }
}