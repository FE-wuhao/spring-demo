package com.hax.demo2;

/**
 * @author 吴灏
 * @create 2023/10/23 17:48
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();

        service.add();
        service.delete();
        service.update();
        service.query();

        UserServiceProxy proxy = new UserServiceProxy();

        proxy.setUserService(service);

        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
    }
}