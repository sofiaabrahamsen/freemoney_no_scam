package com.example.freemoneynoscam.services;

import java.util.Scanner;

public class ValidateEmailService {

    Scanner scanner = new Scanner(System.in);
    public boolean isEmailValid() {
        String email = String.valueOf(scanner);

        if (email.contains(".") && email.contains("@")){
            return true;
        } else return false;
    }
}
