package com.muyu.service.demo;

/**
 * GrayInk
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class GrayInk implements Ink{
    private String brand;

    public GrayInk(String brand) {
        System.out.println("222");
        this.brand = brand;
    }

    @Override
    public void work() {
        System.out.println(brand+"黑白墨盒");
    }

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
}
