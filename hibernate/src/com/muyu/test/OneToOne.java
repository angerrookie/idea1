package com.muyu.test;

import com.muyu.pojo.Account;
import com.muyu.pojo.Detail;
import com.muyu.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * OneToOne
 *
 * @author Administrator
 * @Date 2019/7/27
 */
/**
 * 主键关联配置：
 *  1.主表对象的映射文件中增加<one-to-one></one-to-one>
 *    主表主键生成策略，普通策略(自增native)
 *  2.子表对象的映射文件中增加<one-to-one></one-to-one>
 *      还需要配置主键生成策略
 *      <generator class="foreign">
 *                 <param name="property">account</param>
 *       </generator>
 */
public class OneToOne {
    public static void main(String[] args){
        get();
    }
    public static void  get(){

        Session session = HibernateUtils.getSession();
        Detail detail = session.get(Detail.class,1);
        System.out.println(detail.getAccountByAccid().getAccname());
        session.close();
    }

    public static void  save(){

        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();

        Detail detail = new Detail();
        Account account = new Account();

        detail.setAccountByAccid(account);
        account.setDetailByAccid(detail);

        detail.setUsername("111");
        detail.setEmail("4555");

        account.setAccname("45");
        account.setAccpass("45654");

        session.save(detail);

        transaction.commit();
        session.close();

    }
}
