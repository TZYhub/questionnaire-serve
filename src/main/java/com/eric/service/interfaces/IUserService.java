package com.eric.service.interfaces;

import com.eric.entity.User;

import java.util.List;

public interface IUserService {

    int saveUser(User user) throws Exception;

    int updateUser(User user) throws Exception;

    int deleteUser(int userId) throws Exception;

    User queryByUserId(int userId) throws Exception;

    List<User> queryUserList(User user) throws Exception;

}
