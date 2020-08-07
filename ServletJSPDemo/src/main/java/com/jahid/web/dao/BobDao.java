package com.jahid.web.dao;

import com.jahid.web.model.Bob;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class BobDao {
    public Bob getBob(int aid){
        Bob b = new Bob();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jahid","root","jahid2991");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from alien where aid=" + aid);
            if (rs.next()){
                b.setAid(rs.getInt("aid"));
                b.setAname(rs.getString("aname"));
                b.setTech(rs.getString("tech"));
            }
        }catch (Exception e){
            System.out.println(e);
        }

        return b;
    }

}
