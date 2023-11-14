package com.hax.custom;

/**
 * @author 吴灏
 * @create 2023/11/14 17:32
 * @description 描述
 */
public class CustomClass {

    public void before() {
        System.out.println("方法执行前的日志");
    }

    public void after() {

        System.out.println("方法执行后的日志");
    }
}