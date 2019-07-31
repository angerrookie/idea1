package com.muyu.demo3;

/**
 * LowDisk
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class LowDisk implements IDisk{

    private String size;
    public void doWork(){

        System.out.println("******"+size+"硬盘"+"******");
        System.out.println(fan());
    }
    float fan(){
        return 1;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
