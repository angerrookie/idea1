package com.muyu.demo;

/**
 * ColorInk
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class ColorInk implements Ink{
    private String brand;
    @Override
    public void work() {
        System.out.println(brand+"彩色墨盒");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
