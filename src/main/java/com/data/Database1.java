package com.data;

import org.openqa.selenium.By;

import java.sql.*;

public class Database1 {
    public static void main(String[] args) throws SQLException {
        String host = "localhost";
        String port = "3306";
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/workers","ranjitha","Ashwin@123");
       // Class.forName("com.mysql.jdbc.Driver");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select *from credentials1 where scenario='zerobalancecaerd'");
        while (rs.next()) {
//            Webdriver driver=new firefoxdriver();
//            driver.get("http://login.salesforce.com");
//            driver.findelement(By.id("username")).sendKeys(rs.getString("username"));
//            driver.findelement(By.id("password")).sendKeys(rs.getString("password"));
//            driver.findelement(By.id("Login")).click();
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("password"));
        }
    }
}

