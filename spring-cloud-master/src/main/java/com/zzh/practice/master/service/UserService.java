package com.zzh.practice.master.service;

import com.zzh.practice.master.model.User;

/**
 * description: <br>
 * createTime: 2018/5/314:17 <br>
 *
 * @author zzh
 */
public interface UserService {
    /**
     *
     * Method Name：getUserById
     * Method Description: <br>
     *
     * @param id    UserId
     * @return  查询结果
     * <p>creator：zhihui.zhou
     * <p>createTime：2018/5/3 14:18
     */
    User getUserById(int id);
}
