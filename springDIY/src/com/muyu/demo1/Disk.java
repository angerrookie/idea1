package com.muyu.demo1;

/**
 * Disk
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class Disk {
    private String brand = "40G";//硬盘大小

    public  void  run(){

        System.out.println("读硬盘："+"大小:"+brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
