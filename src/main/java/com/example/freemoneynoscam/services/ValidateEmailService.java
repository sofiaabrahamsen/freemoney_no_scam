package com.example.freemoneynoscam.services;

public class ValidateEmailService {


    public boolean isEmailValid(String email) {

        if (email.contains("@") && email.contains(".") && email.length() > 5){
            return true;
        }

        return false;
    }
}

