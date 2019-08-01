package com.muyu.service.demo1;

/**
 * A
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class A {
    private int id;

    public  A(){
        System.out.println("***********A()***********"+id);
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "A"+id+"<<<<";
    }


}
