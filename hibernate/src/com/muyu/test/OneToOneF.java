package com.muyu.test;

import com.muyu.pojo.Account2;
import com.muyu.pojo.Detail2;
import com.muyu.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * OneToOneF
 *
 * @author Administrator
 * @Date 2019/7/27
 */
/**
 * 一对一  外键关联配置方式
 * 1.主表对象Account中 主键普通方式
 *   添加<one-to-one></one-to-one>
 * 2.子表对象中   主键普通方式
 *   <many-to-one unique="true"></many-to-one>
 * 3.实体类  在主表对象  把集合改成单个对象  Account{ Detail detail;}
 */
public class OneToOneF {
    public static void main(String[] args){

        save();
    }
    public static void get(){
        Session session = HibernateUtils.getSession();
        Detail2 detail = session.get(Detail2.class,1);

        System.out.println(">>>>>===="+detail.getAccount2().getAccname());
        session.close();
    }

    public static void save(){
        Session session = HibernateUtils.getSession();
        Transaction tran = session.beginTransaction();

        Detail2 detail = new Detail2();
        Account2 account = new Account2();

        detail.setAccount2(account);
        account.setDetail2(detail);

        detail.setEmail("zhao@sina.com");
        detail.setUsername("黄盖");

        account.setAccpass("12333");
        account.setAccname("huanggai");

//        session.save(account);
        session.save(detail);

        tran.commit();
        session.close();
    }
}
