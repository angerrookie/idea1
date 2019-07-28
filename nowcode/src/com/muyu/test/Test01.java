package com.muyu.test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Test01
 *
 * @author Administrator
 * @Date 2019/7/28
 * 文件说明:
 */
public class Test01 {
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
        String sql ="insert into project(pname)values(?)";
        int rows;
        try (
                PreparedStatement pStatement = conn.prepareStatement(sql)) {
            //占位符赋值
            pStatement.setString(1, "1");

            //执行语句
            rows = pStatement.executeUpdate();
            System.out.println(rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
