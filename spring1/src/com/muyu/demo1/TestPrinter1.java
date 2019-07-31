package com.muyu.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestPrinter1
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class TestPrinter1 {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/muyu/demo1/spring1.xml");
        B b = (B) context.getBean("b");
        b.run();
    }
}
