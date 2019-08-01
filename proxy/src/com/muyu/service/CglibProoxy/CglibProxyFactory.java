package com.muyu.service.CglibProoxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * CglibProxyFactory
 *
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:
 */
public class CglibProxyFactory implements MethodInterceptor {

    public Object newProxyBean(Object object){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        Object proxy = enhancer.create();
        return  proxy;
    }
    //0:代理对象
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("*****************");
        Object ret =  methodProxy.invokeSuper(o, objects);//调用父类的方法（被代理类）

        return ret;
    }
}
