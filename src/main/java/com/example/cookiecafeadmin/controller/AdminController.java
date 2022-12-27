package com.example.cookiecafeadmin.controller;


import com.example.cookiecafeadmin.aop.SkipCheck;
import com.example.cookiecafeadmin.dto.Admin;
import com.example.cookiecafeadmin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AdminController {

    @Autowired
    AdminService as;

    @SkipCheck
    @PostMapping("/login")
    public Admin adminLogin(Admin admin, HttpSession session){
        Admin admin1 = as.adminLogin(admin);
        if (admin1 != null) {
            session.setAttribute("admin", admin1);
            return admin1;
        }
        return null;
    }
}
