package com.muyu.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Before
 *
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:/**
 *  * 通知：前置通知，后置通知，异常通知，环绕通知
 *  * 前置通知
 *  * MethodBeforeAdvice
 *  *
 *  */

public class Before implements MethodBeforeAdvice {
    private Logger logger = Logger.getLogger("before");
    /**
     * arg0:调用的方法对象
     * arg1:方法中传入的参数
     * arg2:方法所属的对象
     *
     * UserService service = new UserService();
     * service.buy("Java入门",34);
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String methodName = method.getName();
        logger.info("方法名："+methodName+"类:"+target.getClass().getName()+"参数:"+ Arrays.toString(args));
    }
}
