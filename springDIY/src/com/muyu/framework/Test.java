package com.muyu.framework;

import com.muyu.demo3.Computer;

/**
 * Test
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class Test {
    public static void main(String[] args){

        ApplicationContext context = new ApplicationContext("/com/muyu/demo3/spring.xml");
        Computer computer = context.getBean("computer");
        System.out.println(computer);
        computer.run();
    }
}
