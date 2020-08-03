package com.jdbc;

import java.sql.*;

/**
 * @author majie
 * @description
 * @date 2020/5/25
 */
public class JdbcConnection {
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/shenmu?useUniconde=true&amp;characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public static Connection getInstance(){
        try {
            Class.forName(Driver);
            return DriverManager.getConnection(URL,USER,PASSWORD);
        }catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    //直接访问
   /* public static void main(String[] args) throws SQLException {
        Connection conn = JdbcConnection.getInstance();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from orgman_user");
        while (rs.next()){
            System.out.println(rs.getString("USERNAME"));
        }
        rs.close();
        st.close();
        conn.close();
    }*/


   //通过连接池
    public static void main(String[] args) throws SQLException {
        Connection conn = ConnectionPool.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from orgman_user");
        while(rs.next()){
            System.out.println(rs.getString("USERNAME"));
        }
        rs.close();
        st.close();
        ConnectionPool.close(conn);
    }



}
