package com.muyu.service;

import com.muyu.UserDao.UserDao;
import com.muyu.pojo.User;;

/**
 * 业务层
 */
public class UserService {
    //依赖
    private UserDao userDao;
    public void reg(User user){
        System.out.println(userDao+"==-UserDao-=="+user);
        userDao.save(user);
    }

    //注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
