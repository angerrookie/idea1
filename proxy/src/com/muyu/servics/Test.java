package com.muyu.servics;

/**
 * Test
 *
 * @author Administrator
 * @Date 2019/7/31
 * 文件说明:
 */
public class Test {
    public static void main(String[] args){

//       ISale iSale = new Sale();
//       ISale iSale1 = new SaleProxy(iSale);
//       iSale1.sale();

        IUser iUser = new UserService();
        IUser iUser1 = new SaleProxy((UserService) iUser);
        iUser1.login("1111", "3333");
    }
}
