package com.muyu.servics;

/**
 * UserService
 *
 * @author aRookie
 * @Date 2019/7/31
 * 文件说明:
 */
public class UserService implements IUser {
    @Override
    public void login(String name, String pass) {
        System.out.println("*************登录操作*************");
    }
}
