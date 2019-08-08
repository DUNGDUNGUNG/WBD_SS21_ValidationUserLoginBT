package com.codegym.controller;

import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/user-login")
    public ModelAndView showForm(){
        return new ModelAndView("index","user",new User());
    }

    @PostMapping("/user-login")
    public ModelAndView checkValidation(@Valid @ModelAttribute("user") User user, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return new ModelAndView("index");
        }else {
            return new ModelAndView("result");
        }
    }
}
