package com.mao.lesson05;

import com.mao.lesson02.utils.JdbcUtils;
import com.mao.lesson05.utils.JdbcUtils_C3P0;
import com.mao.lesson05.utils.JdbcUtils_DBCP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class TestC3P0 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st =null;

        try{
            conn= JdbcUtils_C3P0.getConnection();   //原来是自己实现的，现在用别人实现的

            String sql = "insert into users(id,`NAME`,`PASSWORD`,`email`,`birthday`) values(?,?,?,?,?)";

            st = conn.prepareStatement(sql);    // 预编译SQL，先写sql，然后不执行

            //手动给参数赋值
            st.setInt(1,7);
            st.setString(2,"胡超超");
            st.setString(3,"10428376");
            st.setString(4,"2557523039@qq.com");
            // 注意点: sql.data   数据库 java.sql.Date()
            //        util.Date     Java  new Date().getTime()  获得时间戳
            st.setDate(5,new java.sql.Date(new Date().getTime()));

            //执行
            int i = st.executeUpdate();
            if (i>0){
                System.out.println("插入成功！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.release(conn,st,null);
        }
    }

}
