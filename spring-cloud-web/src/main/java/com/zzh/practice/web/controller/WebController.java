package com.zzh.practice.web.controller;

import com.zzh.practice.web.component.MyConfig;
import com.zzh.practice.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description: <br>
 * createTime: 2018/6/110:05 <br>
 *
 * @author zzh
 */
@Controller
public class WebController {
    @Autowired
    MyConfig myConfig;

    @RequestMapping("test")
    @ResponseBody
    public Object test(@RequestBody User user) {
        System.out.println(user);
        return user;
    }

    @GetMapping("index")
    public String index() {
        System.out.println(myConfig);
        return "index";
    }
}
