package com.hax.service;

/**
 * @author 吴灏
 * @create 2023/10/31 16:58
 * @description 描述
 */
public class UserServiceImpl implements UserService {

    @Override
    public boolean add() {
        System.out.println("新增");

        return true;
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("更改");
    }

    @Override
    public void query() {
        System.out.println("查询");
    }
}