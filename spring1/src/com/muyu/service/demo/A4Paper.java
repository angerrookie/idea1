package com.muyu.service.demo;

/**
 * A4Paper
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class A4Paper implements Paper{
    private int width;
    private int heigh;

    @Override
    public void work() {
        System.out.println("A4纸 "+"宽度:"+width+" 高度:"+heigh);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }
}
