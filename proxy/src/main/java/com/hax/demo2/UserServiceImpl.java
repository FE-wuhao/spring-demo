package com.hax.demo2;

/**
 * @author 吴灏
 * @create 2023/10/23 17:48
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增");
    }

    @Override
    public void delete() {
        System.out.println("删");
    }

    @Override
    public void update() {
        System.out.println("改");
    }

    @Override
    public void query() {
        System.out.println("查");
    }
}