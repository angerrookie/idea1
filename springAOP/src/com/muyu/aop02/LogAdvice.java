package com.muyu.aop02;


import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * LogAdvice
 *
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:
 */
public class LogAdvice {
    public void myAdvice(JoinPoint joinpoint){
       Object[] params = joinpoint.getArgs();
       String methodName = joinpoint.getSignature().getName();
       String className = joinpoint.getTarget().getClass().getName();

        System.out.println("*************"+"--"+ Arrays.toString(params) +"--"+methodName+"--"+className+"--");
    }

    public void myAfter(){
        System.out.println("*********after************");
    }
    public void myfanal(){
        System.out.println("**********8afterfanal***********");
    }
}
