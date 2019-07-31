package com.muyu.demo1;

/**
 * DiskHeight
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class DiskHeight {
    private String capacity = "500G";

    public  void  diskWork(){
        System.out.println("-----高级硬盘工作--------");

    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
