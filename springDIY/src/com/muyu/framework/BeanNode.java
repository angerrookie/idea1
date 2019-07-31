package com.muyu.framework;

import java.util.Map;

/**
 * BeanNode
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class BeanNode {
    private String id;
    private String clas;
    private Map<String,PropertyNode> props;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public Map<String, PropertyNode> getProps() {
        return props;
    }

    public void setProps(Map<String, PropertyNode> props) {
        this.props = props;
    }
}
