package com.muyu.query;

import com.muyu.pojo.User;
import com.muyu.utils.HibernateUtils;
import org.hibernate.Session;

/**
 * Test2
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 *   0.把支持二级缓存的jar包拷贝到项目中
 *   1.配置文件中开启二级缓存
 *   <property name="cache.use_second_level_cache">true</property>
 *   2.配置支持二级缓存的支持类
 *  <property name="hibernate.cache.region.factory_class">org.hibernate.cache.ehcache.internal.SingletonEhcacheRegionFactory</property>
 *   3.在所查询的需要缓存的对象映射文件中，<class>下面添加配置
 *   <cache usage="read-only"></cache>
 *或者直接在配置文件中对类配置
 * <class-cache class="com.muyu.pojo.User"
 * 4、自定义缓存策略
 *  自定义ehcache.xml
 *      此文件模板在ehcache-2.10.3.jar\ehcache-failsafe.xml
 */

public class Test2 {

    public static void main(String[] args){

        test1();
        test1();
    }

    public static void  test1(){

        Session session = HibernateUtils.getSession();
        User user = session.get(User.class,4);
        System.out.println(user.getUserName()+"----"+user.getSocietyDept());
        session.close();
    }
}
