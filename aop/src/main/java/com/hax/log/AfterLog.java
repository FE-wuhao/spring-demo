package com.hax.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author 吴灏
 * @create 2023/11/14 16:32
 * @description 描述
 */
public class AfterLog implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        if (target != null) {
            System.out.println("类" + target.getClass().getName() + "的方法【" + method.getName() + "】执行完了，返回值为：" + returnValue);
        }
    }
}