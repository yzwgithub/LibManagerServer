package org.andois.db;

import java.sql.*;

import static org.andois.util.Constant.*;

/**
 * Created by ASUS on 2017/7/17.
 */
public class UserDb {
    public static boolean connect(String userId,String userName,String pss){
        String sql="select user_id,user_name,password from user where user_id="+ "'"+userId+"'"+
                "and user_name="+ "'"+userName+"'"+
                "and password="+"'"+pss+"'";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection(sql_url, user, password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next()){
                return true;
            }
            rs.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void Register(int userId,String userName,String pss,String nickName){
        String sql="insert into user (user_id,user_name,password,nickname) values ('"+userId+"','"+userName+"','"+pss+"','"+nickName+"')";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection(sql_url,user,password);
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
