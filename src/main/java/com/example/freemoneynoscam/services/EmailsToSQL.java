package com.example.freemoneynoscam.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmailsToSQL {


    public void insertEmailToDB(String email){

        try {
            PreparedStatement statement = Database.connectDB().prepareStatement("INSERT INTO emails (`email`) VALUES (?);");
            statement.setString(1,email);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
