package com.muyu.framework;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ApplicationContext
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class ApplicationContext {

    private   String fileName;
    private Map<String,Object> beanMap = new HashMap<>();
    //使用bean的Id作为key,BeanNode作为值
    private Map<String,BeanNode> nodeMap = new HashMap<>();
    public  ApplicationContext(String fileName){
        this.fileName = fileName;
        try {
            parse();
            bean();
            propToBean();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void parse() throws DocumentException {
        System.out.println("-----解析XML文件----");
        SAXReader saxReader = new SAXReader();
        InputStream in = this.getClass().getResourceAsStream(fileName);
        Document document = saxReader.read(in);
        Element rootElement = document.getRootElement();
        ///获取节点列表
        List<Element> beanlist = rootElement.elements();
        for (Element element : beanlist) {
           String id = element.attributeValue("id");
           String clas = element.attributeValue("class");
            //解析PROPERTY
            List<Element> list = element.elements("property");
            Map<String,PropertyNode> propertyNodeMap = new HashMap<>();
            for (Element element1 : list) {

                String name = element1.attributeValue("name");
                String value = element1.attributeValue("value");
                String ref = element1.attributeValue("ref");
                //实例化
                PropertyNode propertyNode = new PropertyNode();
                propertyNode.setName(name);
                propertyNode.setValue(value);
                propertyNode.setRef(ref);
                //name为key  propertyNode为值
                propertyNodeMap.put(name, propertyNode);
            }
            //实例化BeanNode
            BeanNode beanNode = new BeanNode();
            beanNode.setId(id);
            beanNode.setClas(clas);
            beanNode.setProps(propertyNodeMap);
            //id为key  beanNode为值
            nodeMap.put(id, beanNode);
        }

    }
    /**
     * 实例化bean对象
     * */
    public <T> T getBean(String id){
        //
        System.out.println("---------返回beannode-----");
        return (T)beanMap.get(id);
    }
    public void bean() throws Exception{
        System.out.println("----实例化bean对象----");
        Set<Map.Entry<String,BeanNode>> set = nodeMap.entrySet();
        for (Map.Entry<String, BeanNode> entry : set) {
            String id = entry.getKey();// id---key
            BeanNode beanNode = entry.getValue();//beannode--value

            String classnanme = beanNode.getClas();
            //实例化
            Object object =  Class.forName(classnanme).newInstance();
            beanMap.put(id, object);
        }
    }

    public void propToBean() throws Exception{
        System.out.println("------赋值-----");
        Set<Map.Entry<String,BeanNode>> set = nodeMap.entrySet();
        for (Map.Entry<String, BeanNode> entry : set) {
            String id = entry.getKey();// id---key
            BeanNode beanNode = entry.getValue();//beannode--value
            //属性列表
            Map<String,PropertyNode> propertyNodeMap = beanNode.getProps();
            //取出当前对象 属性默认为null
            Object beanobj = beanMap.get(id);
            //给当前对象属性赋值
            Set<Map.Entry<String,PropertyNode>> propset = propertyNodeMap.entrySet();
            for (Map.Entry<String, PropertyNode> propertyNodeEntry : propset) {
                String name = propertyNodeEntry.getKey();
                PropertyNode propertyNode = propertyNodeEntry.getValue();
                String ref = propertyNode.getRef();
                String val = propertyNode.getValue();
                //对象beanobj 属性名 name  属性值 ref或val
                String setMethodName = "set"+name.substring(0, 1).toUpperCase()+name.substring(1);
                Class<?> type = beanobj.getClass().getDeclaredField(name).getType();
                Method method = beanobj.getClass().getDeclaredMethod(setMethodName,type);
                //调用方法  赋值
                if(ref!=null){
                    method.invoke(beanobj, beanMap.get(ref));
                }else{
                    if (type==Integer.class||type==int.class){
                        method.invoke(beanobj, Integer.parseInt(val));
                    }else if (type==Float.class||type==float.class){
                        method.invoke(beanobj, Float.parseFloat(val));
                    }else if (type==String.class){
                        method.invoke(beanobj, val);
                    }
                }
            }
        }
    }
}
