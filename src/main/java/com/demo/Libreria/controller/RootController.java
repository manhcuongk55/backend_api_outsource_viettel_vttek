package com.demo.Libreria.controller;

import com.demo.Libreria.entities.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/register")
    public String register(Model model){
        model.addAttribute("users", new Users(""));
//        model.addAttribute("message",false);
        return "register";
    }
  
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
   
    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }
    
}
