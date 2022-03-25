package com.example.freemoneynoscam.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {

    static Connection con;

    public static Connection connectDB()
    {
        try
        {
            String url = "jdbc:mysql://localhost:3306/free_money";
            con = DriverManager.getConnection(url,"root","Sofia1864");
            System.out.println("Ok, we have a connection.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } return con;
    }

}
