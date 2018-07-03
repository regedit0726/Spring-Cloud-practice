package com.zzh.practice.web.model;

import lombok.Data;

/**
 * description: <br>
 * createTime: 2018/6/110:05 <br>
 *
 * @author zzh
 */
@Data
public class User {
    private String name;
    private int age;
    private String nickName;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"age\":")
                .append(age);
        sb.append(",\"nickName\":\"")
                .append(nickName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
