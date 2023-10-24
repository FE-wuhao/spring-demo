package com.hax.demo2;

/**
 * @author 吴灏
 * @create 2023/10/23 17:48
 */
public class UserServiceProxy {
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void log(String type) {
        System.out.println("【DEBUG】当前执行的方法类型是：" + type);
    }

    public void add() {

        userService.add();

        log("增");
    }

    public void delete() {

        userService.delete();

        log("删");
    }

    public void update() {

        userService.update();

        log("改");
    }

    public void query() {

        userService.query();

        log("查");
    }
}