package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.services.EmailsToSQL;
import com.example.freemoneynoscam.services.ValidateEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @PostMapping("/get-free-money-success")
    public String getFreeMoney(WebRequest dataFromForm) {

        String email = dataFromForm.getParameter("email");
        ValidateEmailService validateEmailService = new ValidateEmailService();
        EmailsToSQL emailsToSQL = new EmailsToSQL();

        if (validateEmailService.isEmailValid(email)) {
            System.out.println(dataFromForm.getParameter("email"));
            emailsToSQL.insertEmailToDB(email);
            return "get-free-money-success";
        } else {
            System.out.println("Invalid email");
        }
        return "redirect:/";

    }
    @GetMapping("/get-free-money-success")
    public String getMoney() {
        return "get-free-money-success";
    }

}





