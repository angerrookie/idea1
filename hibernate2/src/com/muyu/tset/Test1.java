package com.muyu.tset;

import com.muyu.pojo.Project;
import com.muyu.pojo.Student;
import com.muyu.utils.HibernateUtils;
import org.hibernate.Session;

/**
 * Test1
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class Test1 {
    public static void main(String[] args){

        Session session = HibernateUtils.getSession();
        Student student = session.get(Student.class, 4);
        System.out.println(student.getSname());
        session.close();
        queryProject();
    }
    public static void  queryProject(){

        Session session = HibernateUtils.getSession();
        Project project = session.get(Project.class, 1);
        System.out.println(project.getPno()+"---"+project.getPname());
        session.close();
    }
}
