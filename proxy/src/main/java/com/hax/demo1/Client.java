package com.hax.demo1;

/**
 * @author 吴灏
 * @create 2023/10/23 17:12
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        Proxy proxy = new Proxy(host);

        proxy.rent();
    }
}