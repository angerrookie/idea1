package com.muyu.demo3;

/**
 * ColorDisplay
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class ColorDisplay implements IDisplay{

    private String brand;
    @Override
    public void show() {
        System.out.println("******"+brand+"彩色显示器"+"******");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
