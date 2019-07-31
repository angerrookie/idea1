package com.muyu.demo1;

/**
 * B
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class B {
    private  A a;

    public B(){
        System.out.println("B》》》》》》》");
    }
    public void run(){
        System.out.println("--------B()-----------"+a);
    }

    public void setA(A a) {
        this.a = a;
    }
}
