package com.muyu.test;

import com.muyu.pojo.School;
import com.muyu.pojo.Student;
import com.muyu.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Set;


public class OneToManyTest {


    public static void main(String[] args) {

        select();
    }

    public static  void select(){
        Session session = HibernateUtils.getSession();
        School school = session.get(School.class,9);
        System.out.println(">>>"+school.getScname());

        Set<Student> students = school.getSet();
       for (Student student:students){
           System.out.println(student.getSname());
       }
       session.close();
    }
    /**
     * 通过一方对象级联保存多方对象
     * cascade="all" inverse="true"
     */
    public static  void save(){
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();
        School school = new School();
        school.setScname("第二中学");

        Student student = new Student();
        student.setSname("李四");

        //在学校下添加一个新学员
        school.getSet().add(student);
        student.setSchool(school);

        session.save(school);

        transaction.commit();
        session.close();
    }
}







