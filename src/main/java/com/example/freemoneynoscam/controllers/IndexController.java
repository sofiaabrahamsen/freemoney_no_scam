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
    public String index(){
        return "index";
    }

    @PostMapping("/test")
    public String test(WebRequest dataFromForm){

        String email = dataFromForm.getParameter("email");
        ValidateEmailService validateEmailService = new ValidateEmailService();
        EmailsToSQL emailsToSQL = new EmailsToSQL();

        if (validateEmailService.isEmailValid()){
            System.out.println(dataFromForm.getParameter("email"));
            emailsToSQL.insertEmailToDB(email);
            return "redirect:/succes";
        } else return "redirect:/error";

    }


}
