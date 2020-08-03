package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author majie
 * @description 模拟一次数据库连接池
 * @date 2020/5/25
 */
public class ConnectionPool {
    private static List<Connection> pool = new ArrayList<>();
    private static int NORMAL = 10;//初始化连接数
    private static int MAX = 20;//最大连接数
    private static int MIN = 5;//最小连接数

    static{
        while(pool.size() < NORMAL){
            pool.add(JdbcConnection.getInstance());
        }
    }

    //获取一个连接
    public static Connection getConnection(){
        if(pool.size() > MIN){
            return pool.remove(0);
        }else{
            if (pool.size() <= MAX){
                Connection conn = JdbcConnection.getInstance();
                pool.add(conn);
                return conn;
            }else{
                Connection conn = JdbcConnection.getInstance();
                return conn;
            }
        }
    }

    public static void close(Connection conn){
        if(conn != null && pool.size() < MAX){
            pool.add(conn);
        }else{
            try{
                conn.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
