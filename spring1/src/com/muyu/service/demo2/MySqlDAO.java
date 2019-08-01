package com.muyu.service.demo2;

/**
 * MySqlDAO
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public class MySqlDAO implements Dao{
    @Override
    public void connection() {
        System.out.println("---mysql------");
    }
}
