package com.muyu.demo1;

/**
 * Computer
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class Computer {
    private Disk disk = new Disk();
    private Display display = new Display();

    public  void  run(){

        System.out.println("电脑启动");
        disk.run();
        display.show();
        System.out.println("电脑工作中.....");
    }

}
