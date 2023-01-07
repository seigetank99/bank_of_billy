package com.bank_of_billy.bank_of_billy.controller_advisor;

import com.bank_of_billy.bank_of_billy.model.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class AdvisorController {

    @ModelAttribute("registerUser")
    public User getUserDefault(){
        return new User();
    }
}
