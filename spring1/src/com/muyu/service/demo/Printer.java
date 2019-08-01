package com.muyu.service.demo;

/**
 * Printer
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class Printer {
    private Ink ink;
    private Paper paper;

//    public Printer(Paper paper,Ink ink){
//        this.paper = paper;
//        this.ink = ink;
//    }
    public void run(){
        System.out.println("启动打印机");
        if (ink==null){
            System.out.println("请安装墨盒");
        }else{
            ink.work();
        }
        if (paper==null){
            System.out.println("无纸张");
        }else{
            paper.work();
        }
        System.out.println("打印结束");
    }

    public void setInk(Ink ink) {
        System.out.println("11111");
        this.ink = ink;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

}
