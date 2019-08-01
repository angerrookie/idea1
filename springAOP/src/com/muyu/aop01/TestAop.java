package com.muyu.aop01;

import com.muyu.service.Sale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestAop
 *
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:
 */
public class TestAop {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("com/muyu/aop01/proxy.xml");
        Sale service = (Sale) context.getBean("sal");
        service.sale();
       // System.out.println(format.format(new Date()));
//        DateFormat format = new SimpleDateFormat("yyyy/MM/dd/hh:mm:ss:SSS");
    }
}
