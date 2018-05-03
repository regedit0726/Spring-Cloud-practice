package com.zzh.practice.master.service.impl;

import com.zzh.practice.master.dao.UserDao;
import com.zzh.practice.master.model.User;
import com.zzh.practice.master.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description: <br>
 * createTime: 2018/5/314:18 <br>
 *
 * @author zzh
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
