package com.muyu.service.CglibProoxy;

import com.muyu.service.servics.IUser;
import com.muyu.service.servics.UserService;

/**
 * Test
 *
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:
 */
public class Test {
    public static void main(String[] args){

        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory();
        IUser iUser = new UserService();
        //IUser iUser1 = (IUser) cglibProxyFactory.newProxyBean(iUser);
        //iUser1.login("111", "2222");
        UserService userService = (UserService) cglibProxyFactory.newProxyBean(iUser);
        userService.login("111", "3333");
    }
}
