package com.hax.demo3;

/**
 * @author 吴灏
 * @create 2023/10/23 17:12
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        proxyInvocationHandler.setTarget(host);

        Rent proxy = (Rent) proxyInvocationHandler.getProxy();

        proxy.rent();
    }
}