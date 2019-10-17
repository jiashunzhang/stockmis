package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * UserController
 */
@Controller
public class UserController {
    @Autowired
    JdbcTemplate jdbc;




    @RequestMapping("/adduser")
    public String addUser(String uname, String upass, Model model) {
        String msg = "fail";
        int i = jdbc.update("insert into users values(?,?)", new Object[]{uname,upass} );
        if(i>0) {
            msg = "success";
        }
        model.addAttribute("result", msg);
        return "info";
    }


}