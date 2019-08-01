package com.muyu.aop02;

import com.muyu.service.IUser;
import com.muyu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test
 *
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:
 */
public class Test {
    static  int a;

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("com/muyu/aop02/aop02.xml");
        IUser userService = (IUser) context.getBean("user");
        userService.login("11", "111");
        System.out.println(a);
        Object a = new Object();
    }
}
