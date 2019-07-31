package com.muyu.demo3;

/**
 * GrayDisplay
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class GrayDisplay implements IDisplay{
    private String brand;
    @Override
    public void show() {
        System.out.println("******"+brand+"黑白显示器"+"******");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
