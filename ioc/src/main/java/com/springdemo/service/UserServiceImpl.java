package com.springdemo.service;

import com.springdemo.dao.UserDao;

public class UserServiceImpl implements UserService{
 private UserDao user;

 public void setUser(UserDao user){
      this.user =user;
    }

    @Override
    public void getUserInfo() {
        user.getUserInfo();
    }
}
