package com.springDemo.service;

import com.springDemo.dao.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao user;

    public void setUser(UserDao user) {
        this.user = user;
    }

    @Override
    public void getUserInfo() {
        user.getUserInfo();
    }
}