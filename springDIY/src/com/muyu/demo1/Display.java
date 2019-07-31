package com.muyu.demo1;

/**
 * Display
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class Display {
    private int width = 400;
    private int height = 300;

    public  void  show(){

        System.out.println("内容显示"+width+"--"+height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
