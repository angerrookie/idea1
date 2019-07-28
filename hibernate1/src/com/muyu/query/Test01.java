package com.muyu.query;

import com.muyu.pojo.Project;
import com.muyu.pojo.User;
import com.muyu.utils.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;


import java.util.List;

/**
 * Test01
 *
 * @author Administrator
 * @Date 2019/7/28
 * 文件说明:
 */
public class Test01 {
    public static void main(String[] args){

        //test3();
        //limite();
        test5();
    }
    /**
     * 单个属性查询  元素类型为属性类型
     * */
    public static void  test1(){

        Session session = HibernateUtils.getSession();
        String hsql = "select pname from Project ";
        Query query = session.createQuery(hsql);

        List<String> projectList = query.list() ;
        for (String project:projectList) {
            System.out.println(project);
        }
    }
    /**
     * 查询多个属性  结果类型为Object[]
     * */
    public static void  test2(){

        Session session = HibernateUtils.getSession();
        String hsql = "select pno,pname from Project ";

        Query query =  session.createQuery(hsql);

        List<Object[]> projectList = query.list() ;
        for (Object[] objects : projectList) {
            System.out.println(objects[0]+">>>"+objects[1]);
        }
    }
    public static void  test3(){

        Session session = HibernateUtils.getSession();
        String hsql = "from Project where pno=:pno and pname=:pname";
        Query query = session.createQuery(hsql);
        query.setParameter("pno",3);
        query.setParameter("pname","1");

       Project obj = (Project) query.uniqueResult();
        System.out.println(obj.getPno()+"==="+obj.getPname());
    }
    /**
     * 分页查询
     * */
    public static void  limite(){

        Session session = HibernateUtils.getSession();
        String hsql = "from User";
        Query query = session.createQuery(hsql);
        //当前页
        int currentPage = 2;
        //每页显示数
        int pageNums = 5;
        //开始位置
        int startIndex = (currentPage-1)*pageNums;
        //设置每页显示记录数
        query.setMaxResults(pageNums);
        query.setFirstResult(startIndex);
        System.out.println(">>>>>>>>>");
        List<User> userList = query.list();
        for (User user : userList) {
            System.out.println(user.getUserId()+">>>>"+user.getUserName());
        }
        session.close();
    }
    /**
     * 命名SQL 在映射文件中配置SQL语句
     */
    public static void  test4(){

        Session session = HibernateUtils.getSession();
        Query query = session.getNamedQuery("sql");
        List<User> userList = query.list();
        for (User user : userList) {
            System.out.println(user.getUserName());
        }
    }
    /**
     * 命名HQL 在映射文件中配置
     */
    public static void  test5(){

        Session session = HibernateUtils.getSession();
        Query query = session.getNamedQuery("hql");
        List<User> userList = query.list();
        for (User user : userList) {
            System.out.println(user.getUserName());
        }
    }
}
