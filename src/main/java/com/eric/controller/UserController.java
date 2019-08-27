package com.eric.controller;

import com.eric.entity.User;
import com.eric.service.interfaces.IUserService;
import com.eric.utils.JSONResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("user")
public class UserController {

    final static Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    IUserService userService;

    @RequestMapping("/saveUser")
    public Object saveUser() throws Exception{
        User user = new User();
        user.setUserId(1000000002);
        user.setUsername("tzyTest");
        user.setPassword("123456");
        user.setState(0);
        user.setCreateTime(new Date());
        user.setLastLoginTime(new Date());
        user.setEmail("123456@qq.com");
        user.setRandomCode("1234");
        log.debug("user = "+user);
        return userService.saveUser(user);
    }

    @RequestMapping("/queryUser")
    public Object queryUser() throws Exception{
        User user = new User();
        user.setUserId(1000000005);
        List<User> users = userService.queryUserList(user);
        return JSONResultUtil.ok(users);
    }

}
