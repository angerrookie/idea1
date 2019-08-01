package com.muyu.UserDao;


import com.muyu.pojo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * 数据库访问层
 */
public class UserDao {
    private SessionFactory sessionFactory;
    public void save(User user){
        Session session = sessionFactory.openSession();
        Transaction tran = session.beginTransaction();
        session.save(user);
        tran.commit();
        session.close();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
