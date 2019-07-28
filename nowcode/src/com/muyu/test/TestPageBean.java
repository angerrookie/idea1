package com.muyu.test;

import com.muyu.pojo.Project;
import com.muyu.utils.PageBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * TestPageBean
 *
 * @author Administrator
 * @Date 2019/7/28
 * 文件说明:
 */
public class TestPageBean {
    private static Connection conn;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/corporationservices";
    private static String username = "root";
    private static String password = "root";

    public static void getConn(){

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        getConn();
        PageBean<Project> pageBean = new PageBean<>();
        pageBean.setCurrentPage(1);
        pageBean.setPageNums(2);
        String sql = "select count(*) from Project";


    }
}
