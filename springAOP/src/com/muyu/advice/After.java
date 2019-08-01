package com.muyu.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Logger;

/**
 * After
 *
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:
 * 后置通知：实现接口AfterReturningAdvice
 */
public class After implements AfterReturningAdvice {
    private Logger logger = Logger.getLogger("after");
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        String methodName = method.getName();
        logger.info("方法名:"+methodName+" 类："+target.getClass().getName()+" 参数："+ Arrays.toString(args)+" 结果："+returnValue);
    }
}
