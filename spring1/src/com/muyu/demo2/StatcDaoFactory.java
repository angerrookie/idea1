package com.muyu.demo2;

/**
 * DaoFactory
 *
 * @author Administrator
 * @Date 2019/7/30
 * 文件说明:
 */
public abstract class StatcDaoFactory {
    public  static  final  int DB_MYSQL = 1;
    public  static  final  int DB_ORACLE = 2;


    public static Dao newDao(int type){
        if (type==DB_MYSQL){
            return new MySqlDAO();
        } else if (type==DB_ORACLE){
            return new OracleDao();
        }else {
            return new Dao() {
                @Override
                public void connection() {
                    System.out.println("默认");
                }
            };
        }
    }


}
