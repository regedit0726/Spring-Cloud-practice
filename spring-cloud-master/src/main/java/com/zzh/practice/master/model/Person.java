package com.zzh.practice.master.model;

import lombok.Data;

/**
 * description： <br>
 * createTime: 2018/4/89:52 <br>
 *
 * @author zzh
 */
@Data
public class Person {

    private String id;

    private String name;

    private int age;

    private String address;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"")
                .append(id).append('\"');
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"age\":")
                .append(age);
        sb.append(",\"address\":\"")
                .append(address).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
