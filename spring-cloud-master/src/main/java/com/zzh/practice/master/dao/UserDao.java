package com.zzh.practice.master.dao;

import com.zzh.practice.master.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description： <br>
 * createTime: 2018/4/1419:25 <br>
 *
 * @author zzh
 */
@Repository
public interface UserDao {
    User getUserById(int id);

    List<User> queryUser(@Param("name") String name);
}
