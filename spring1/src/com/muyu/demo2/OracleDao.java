package com.muyu.demo2;

/**
 * OracleDao
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class OracleDao implements Dao{

    @Override
    public void connection() {
        System.out.println("---oracle------");
    }
}
