package com.muyu.servics;

/**
 * SaleProxy
 *
 * @author Administrator
 * @Date 2019/7/31
 * 文件说明:
 */
public class SaleProxy implements ISale{
    private  ISale iSale;
    public SaleProxy(ISale iSale){
        this.iSale = iSale;
    }
    @Override
    public void sale() {
        System.out.println("*********");
        iSale.sale();//售票
        System.out.println("*********");
    }
}
