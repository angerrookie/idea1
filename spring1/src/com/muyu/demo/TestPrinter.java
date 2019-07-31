package com.muyu.demo;



import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestPrinter
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class TestPrinter {
    public static void main(String[] args){

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/muyu/demo/spring.xml");
        Printer printer = (Printer) ac.getBean("printer");
        printer.run();

    }
}
