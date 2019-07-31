package com.muyu.proxy;


import com.muyu.servics.ISale;
import com.muyu.servics.IUser;
import com.muyu.servics.Sale;
import com.muyu.servics.UserService;

/**
 * Test
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:
 *          动态代理
 */
public class Test {
    public static void main(String[] args){

        ProxyBeanFactory proxyBeanFactory = new ProxyBeanFactory();
//        ISale iSale  = new Sale();
////////        ISale iSale1 = (ISale) proxyBeanFactory.newProxy(iSale);
////////        iSale1.sale();
        IUser iUser = new UserService();
        IUser iUser1 = (IUser) proxyBeanFactory.newProxy(iUser);
        iUser1.login("123", "123");

    }
}
