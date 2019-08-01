package com.muyu.Action;

import com.muyu.pojo.User;
import com.muyu.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    //依赖业务层  注入
    private UserService userService;
    /**
     * 注册
     * @return
     */
    public String register(){
        System.out.println(user.getUserName()+"==="+user.getPass());
        System.out.println(">>>>service:===="+userService);
        userService.reg(user);
        return SUCCESS;
    }

    /**
     * 登录
     * @return
     */
    public String login(){
        return SUCCESS;
    }

    //注入的方法
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User getModel() {
        return user;
    }

//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//       UserService userService = (UserService) context.getBean("userService");
//
//        User user = new User();
//        user.setUserName("22222");
//        user.setPass("1111");
//
//        userService.reg(user);
//    }

}
