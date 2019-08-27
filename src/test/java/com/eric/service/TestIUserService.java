package com.eric.service;

import com.eric.QuestionnaireServeApplication;
import com.eric.entity.User;
import com.eric.service.interfaces.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = QuestionnaireServeApplication.class)
public class TestIUserService {
    @Autowired
    private IUserService userService;

    @Test
    public void testSaveUser() throws Exception{
        User u = new User();
        //userId字段可自增
        u.setUsername("tzyTest3");
        u.setState(0);
        u.setRandomCode("1234");
        u.setEmail("1234@qq.com");
        u.setCreateTime(new Date());
        u.setLastLoginTime(new Date());
        u.setPassword("1234");
        userService.saveUser(u);
    }

    @Test
    public void testUpdateUser() throws Exception{
        User u = new User();
        u.setUserId(1000000001);//无主键时不更新任何数据，也不报错
        u.setPassword("11111");
        u.setUsername("tzyTest1");
        System.out.println(userService.updateUser(u));
    }

    @Test
    public void testDeleteUser() throws Exception{
        System.out.println(userService.deleteUser(1000000004));
    }

    @Test
    public void testSelectUserList() throws Exception{
        User u = new User();
        u.setUserId(1000000001);
        List<User> users = userService.queryUserList(u);
        for(User user: users){
            System.out.println(user.getUserId());
        }
    }

}
