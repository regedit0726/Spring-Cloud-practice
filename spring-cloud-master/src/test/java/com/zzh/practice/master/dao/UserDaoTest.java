package com.zzh.practice.master.dao;

import com.zzh.practice.master.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * description： <br>
 * createTime: 2018/4/1419:29 <br>
 *
 * @author zzh
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    public void getUserByIdTest() {
        User user = userDao.getUserById(1);
        assert user != null;
    }

    @Test
    public void queryUserTest() {
        List<User> users = userDao.queryUser("  ");
        assert !users.isEmpty();
    }
}
