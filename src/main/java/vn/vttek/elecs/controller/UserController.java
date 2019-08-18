package vn.vttek.elecs.controller;

import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.service.UserService;
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
    public String saveUser(Account account, Model model) {
        userService.saveUser(account);
        System.out.println("save user");
        model.addAttribute("message", true);
        return "/register";
    }
   
    
}
