package com.muyu.service.demo2;

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

//        DaoFactory factory = new DaoFactory();
//        Dao dao = factory.newDao(DaoFactory.DB_ORACLE);
//        dao.connection();
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/muyu/demo2/springDao.xml");
//        Dao dao = (Dao) context.getBean("dao");
//        dao.connection();

        //        Dao dao = DaoFactoryStatic.newDao(DaoFactoryStatic.DB_MYSQL);
//        dao.connectionDB();
        ApplicationContext context = new ClassPathXmlApplicationContext("com/muyu/service/service/demo2/springDao.xml");
        Dao dao = (Dao) context.getBean("staticFactory");
        dao.connection();
    }
}
