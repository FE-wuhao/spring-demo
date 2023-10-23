package com.hax.demo1;

/**
 * @author 吴灏
 * @create 2023/10/23 17:09
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("我是房东，我决定出租房子给你");
    }
}