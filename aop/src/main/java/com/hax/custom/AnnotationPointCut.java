package com.hax.custom;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author 吴灏
 * @create 2023/11/14 17:47
 * @description 使用注解实现切面
 */
@Aspect // 标注为一个切面
public class AnnotationPointCut {

    @Before("execution(* com.hax.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前的日志");
    }

    @After("execution(* com.hax.service.UserServiceImpl.*(..))")
    public void after() {

        System.out.println("方法执行后的日志");
    }
}