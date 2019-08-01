package com.muyu.advice;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Around
 *
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:
 */
public class Around implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        invocation.proceed();
        return 0;
    }
}
