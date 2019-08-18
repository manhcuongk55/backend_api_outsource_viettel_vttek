package com.demo.Libreria.controller;

import com.demo.Libreria.entities.Users;
import com.demo.Libreria.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    
    
    @RequestMapping(value = "user", method = RequestMethod.POST)
    public String saveUser(Users users, Model model) {
        userService.saveUser(users);
        System.out.println("save user");
        model.addAttribute("message", true);
        return "/register";
    }
   
    
}
