package com.muyu.query;

/**
 * Test3
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */

import com.muyu.pojo.User;
import com.muyu.utils.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * 1、先配置二级缓存
 * 2、在配置文件中开启query缓存
 * 3、使用query.list()之前， query.setCacheable(true);
 * */
public class Test3 {
    public static void main(String[] args){

        test();
    }
    public static void  test(){

        Session session = HibernateUtils.getSession();
        String sql = "from User";
        Query query = session.createQuery(sql);
        query.setCacheable(true);
        List<User> users = query.list();
        for (User user : users) {
            System.out.println("--"+user.getUserName()+"--");
        }
        System.out.println("----------------");
        List<User> users1 = query.list();
        for (User user : users1) {
            System.out.println("--"+user.getUserName()+"--");
        }

        session.close();
    }
}
