package com.muyu.service.servics;

/**
 * SaleProxy
 *
 * @author Administrator
 * @Date 2019/7/31
 * 文件说明:
 */
//public class SaleProxy implements ISale{
//    private  ISale iSale;
//    public SaleProxy(ISale iSale){
//        this.iSale = iSale;
//    }
//    @Override
//    public void sale() {
//        System.out.println("*********");
//        iSale.sale();//售票
//        System.out.println("*********");
//    }
//}
public class SaleProxy implements IUser{
    private UserService userService;

    public SaleProxy(UserService userService){
        this.userService = userService;
    }

    @Override
    public void login(String name, String pass) {
        System.out.println("用户名："+name+",密码："+pass);
        userService.login(name, pass);
        System.out.println("******************");

    }
}
