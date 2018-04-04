package com.zzh.practice.master.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * description： <br>
 * createTime: 2018/4/417:04 <br>
 *
 * @author zzh
 */
@RestController
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(HttpServletRequest request) {
        return "Hello World";
    }
}
