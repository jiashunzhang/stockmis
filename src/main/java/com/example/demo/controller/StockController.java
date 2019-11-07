package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * StockController
 */
@Controller
public class StockController {

    @Autowired
    JdbcTemplate jdbc;

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

    @RequestMapping("/addstocktype")
    public String addStockType(String type_name, Model model) {
        int i = jdbc.update("insert into stock_type values(null, ?) ", type_name);
        if(i ==1 ) {
            model.addAttribute("result", "添加成功！");
        } else {
            model.addAttribute("result", "添加失败！");            
        }
        return "info";
    }
    
}