package com.muyu.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class Test {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("com/muyu/demo4/spring.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName()+"----"+student.getAddress());
    }
}
