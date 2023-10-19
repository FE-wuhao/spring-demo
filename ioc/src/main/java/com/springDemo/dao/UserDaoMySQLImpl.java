package com.springDemo.dao;

public class UserDaoMySQLImpl implements UserDao {
    @Override
    public void getUserInfo() {
        System.out.println("这是MySQL测试demo");
    }
}