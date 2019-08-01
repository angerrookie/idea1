package com.muyu.service.demo3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestD
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class TestD {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/muyu/service/service/demo3/springD.xml");
        D d = (D) context.getBean("d");
        //System.out.println(Arrays.toString(d.getArr()));


    }
}
