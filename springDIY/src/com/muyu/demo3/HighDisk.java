package com.muyu.demo3;


/**
 * HighDisk
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class HighDisk implements IDisk{

    private String size;
    public void doWork(){
        System.out.println("******"+size+"高级硬盘"+"******");
    }

    public void setSize(String size) {
        this.size = size;
    }
}
