package com.eric.service.impl;

import com.eric.entity.User;
import com.eric.mapper.UserMapper;
import com.eric.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired(required = false)
    private UserMapper userMapper;


    @Override
    public int saveUser(User user) throws Exception {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) throws Exception {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int deleteUser(String userId) throws Exception {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public User queryByUserId(String userId) throws Exception {
        return userMapper.selectByPrimaryKey(Integer.parseInt(userId));
    }

    @Override
    public List<User> queryUserList(User user) throws Exception {
        return null;
    }
}
