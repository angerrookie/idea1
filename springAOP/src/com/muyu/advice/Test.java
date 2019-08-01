package com.muyu.advice;

import com.muyu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Test
 *
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:
 */
public class Test {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("com/muyu/aop01/proxy.xml");
        UserService service = (UserService) context.getBean("proxy");
        service.login("111", "222");//1000ms=1s
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd/hh:mm:ss:SSS");
        System.out.println(format.format(new Date()));
    }
}
