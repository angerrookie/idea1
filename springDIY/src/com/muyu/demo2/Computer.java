package com.muyu.demo2;

/**
 * Computer
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
public class Computer {
    private IDisk disk;
    private IDisplay display;

    public void run(){
        System.out.println("********电脑启动********");
        if (disk==null){
            System.out.println("没有发现硬盘 ");
        }else{
            disk.doWork();
        }
        if (display!=null){
            display.show();
        }else{
            System.out.println("没有显示器");
        }
        System.out.println("********电脑关机********");
    }

    public IDisk getDisk() {
        return disk;
    }

    public void setDisk(IDisk disk) {
        this.disk = disk;
    }

    public IDisplay getDisplay() {
        return display;
    }

    public void setDisplay(IDisplay display) {
        this.display = display;
    }
}
