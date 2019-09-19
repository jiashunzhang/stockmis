package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * StockController
 */
@Controller
public class StockController {

    @RequestMapping("/addstock")
    public String addStock(Model model) {
        model.addAttribute("result", "this is add stock");
        return "info";
    }
    @RequestMapping("/updatestock")
    public String updateStock(Model model) {
        model.addAttribute("result", "this is update stock");
        return "info";
    }
    
}