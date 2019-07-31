package com.muyu.demo3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * TestD
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class TestD {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/muyu/demo3/springD.xml");
        D d = (D) context.getBean("d");
        //System.out.println(Arrays.toString(d.getArr()));


    }
}
