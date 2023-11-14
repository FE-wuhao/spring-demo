package com.hax.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author 吴灏
 * @create 2023/10/31 17:01
 * @description 描述
 */
public class Log implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        if (target != null) {
            System.out.println("类" + target.getClass().getName() + "的方法【" + method.getName() + "】被执行了");
        }
    }
}