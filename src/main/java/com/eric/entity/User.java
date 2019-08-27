package com.eric.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import javax.persistence.*;

public class User {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * md5加密后的密码
     */
    @JsonIgnore
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户创建时间
     */
    @Column(name = "create_time")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date createTime;

    /**
     * 用户最后登录时间
     */
    @Column(name = "last_login_time")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date lastLoginTime;

    /**
     * 用户账号状态 0：未激活  1：已激活
     */
    private Integer state;

    /**
     * 随机码（用户激活邮箱）
     */
    @Column(name = "random_code")
    private String randomCode;

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户昵称
     *
     * @return username - 用户昵称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户昵称
     *
     * @param username 用户昵称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取md5加密后的密码
     *
     * @return password - md5加密后的密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置md5加密后的密码
     *
     * @param password md5加密后的密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取用户创建时间
     *
     * @return create_time - 用户创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置用户创建时间
     *
     * @param createTime 用户创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取用户最后登录时间
     *
     * @return last_login_time - 用户最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置用户最后登录时间
     *
     * @param lastLoginTime 用户最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取用户账号状态 0：未激活  1：已激活
     *
     * @return state - 用户账号状态 0：未激活  1：已激活
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置用户账号状态 0：未激活  1：已激活
     *
     * @param state 用户账号状态 0：未激活  1：已激活
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取随机码（用户激活邮箱）
     *
     * @return random_code - 随机码（用户激活邮箱）
     */
    public String getRandomCode() {
        return randomCode;
    }

    /**
     * 设置随机码（用户激活邮箱）
     *
     * @param randomCode 随机码（用户激活邮箱）
     */
    public void setRandomCode(String randomCode) {
        this.randomCode = randomCode;
    }
}
