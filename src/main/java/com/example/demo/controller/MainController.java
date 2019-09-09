package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MainController
 */
@Controller
public class MainController {
    @RequestMapping("/checkuser")
    public String CheckUser(String uid, Model model) {
        model.addAttribute("uid", uid);
        return "info";
    }
    
}