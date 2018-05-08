package com.zzh.practice.master.controller;

import com.zzh.practice.master.model.User;
import com.zzh.practice.master.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * description： <br>
 * createTime: 2018/4/417:04 <br>
 *
 * @author zzh
 */
@RestController
public class UserController {
//    @Value("${test}")
    String test = "test";

    @Autowired
    UserService userService;

//    @Autowired
//    RedisService redisService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(HttpServletRequest request) {
        return "Hello World";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(HttpServletRequest request) {
        return test;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User persons(HttpServletRequest request, @PathVariable("id") int id) {
        return userService.getUserById(id);
    }

//    @RequestMapping(value = "/testRedis", method = RequestMethod.GET)
//    public String testRedis() {
//        redisService.setObject("username", "lisi");
//        return "OK";
//    }
}
