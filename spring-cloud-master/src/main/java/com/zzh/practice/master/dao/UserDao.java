package com.zzh.practice.master.dao;

import com.zzh.practice.master.model.User;
import org.springframework.stereotype.Repository;

/**
 * description： <br>
 * createTime: 2018/4/1419:25 <br>
 *
 * @author zzh
 */
@Repository
public interface UserDao {
    User getUserById(int id);
}
