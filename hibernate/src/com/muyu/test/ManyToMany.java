package com.muyu.test;

/**
 * ManyToMany
 *
 * @author Administrator
 * @Date 2019/7/27
 */

import com.muyu.pojo.Employee;
import com.muyu.pojo.Project;
import com.muyu.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 1.使用反向工程生成实体类及映射文件
 * 2.删除关系类，修改项目类和员工类，改为Set集合包含对方
 * 3.修改各自映射文件的主键生成策略
 * 4.修改各自<set></set>节点，子节点改成<many-to-many></many-to-many>
 * 同时要注意：set节点中添加属性table="emp_pro"
 * 在many-to-many节点添加column="eno"
 */
public class ManyToMany {
    public static void main(String[] args){

        save();
    }
    /**
     * 通过项目来级联保存员工时：
     * 需要自项目的映射文件中<set></set>节点增加属性
     * cascade="all" inverse="false"
     * inverse必须为false,操作的项目对象来维护关系
     */
    public static void  save(){

        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        Project project = new Project();

        employee.setEname("哪吒");
        project.setPname("千里送人头");

        //把新员工加入项目组
        project.getEmployees().add(employee);

        session.save(project);
        transaction.commit();
        session.close();

    }
}
