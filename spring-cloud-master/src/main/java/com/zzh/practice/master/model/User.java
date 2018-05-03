package com.zzh.practice.master.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * description： <br>
 * createTime: 2018/4/1411:35 <br>
 *
 * @author zzh
 */
@Data
public class User {
    private int id;
    private String username;
    private String name;
    private short age;
    private BigDecimal balance;
}
