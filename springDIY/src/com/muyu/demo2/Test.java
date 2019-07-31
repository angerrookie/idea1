package com.muyu.demo2;

/**
 * Test
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class Test {
    public static void main(String[] args){

        Computer computer = new Computer();
        LowDisk lowDisk = new LowDisk();
       IDisplay display = new GrayDisplay();

        //组装
        computer.setDisk(lowDisk);
        computer.setDisplay(display);

        computer.run();

        IDisplay display1 = new ColorDisplay();
        computer.setDisplay(display1);

        computer.run();
    }
}
