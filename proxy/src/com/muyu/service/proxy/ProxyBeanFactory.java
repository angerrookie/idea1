package com.muyu.service.proxy;

/**
 * ProxyBeanFactory
 *
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 *
 * */
public class ProxyBeanFactory implements InvocationHandler {

    private Object object;
    public Object newProxy(Object object){
        //通过反射拿到接口
        this.object = object;

        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行原来的方法
        System.out.println("*****"+new Date()+"**调用了"+object.getClass().getName()+"类中的"+method.getName()+"方法,参数:"+args[0]+"、"+args[1]);
        Object ret = method.invoke(object, args);
        System.out.println("******** 结果："+ret);
        return ret;
    }
}
