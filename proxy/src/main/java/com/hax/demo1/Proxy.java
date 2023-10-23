package com.hax.demo1;

/**
 * @author 吴灏
 * @create 2023/10/23 17:12
 */
public class Proxy {
    private final Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public void houseViewing() {
        System.out.println("看房");
    }

    public void signTheContract() {
        System.out.println("签合同");
    }

    public void chargeAnIntermediaryFee() {
        System.out.println("收中介费");
    }

    public void rent() {
        houseViewing();

        host.rent();

        signTheContract();

        chargeAnIntermediaryFee();
    }
}