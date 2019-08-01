package com.muyu.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * ThrowsAdvice
 *
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:
 */
public class AdviceThrows implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Throwable subclass){
        System.err.println("[异常日志]\n    时间：" + new Date()
                + "\n  业务类：" + target.getClass().getName()
                + "\n业务方法："+ method.getName()
                + "\n    参数："+ printArray(args)
                + "\n异常信息："+ subclass.getMessage()
                + "\n堆栈信息：" + subclass.getStackTrace());
        System.out.println("\n*************************异常通知结束****************************");
    }
    private String printArray(Object[] args){
        String s = "";
        for(Object o : args){
            s += o.toString();
        }
        return s;
    }


}
