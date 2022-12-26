package com.example.cookiecafeadmin.service;


import com.example.cookiecafeadmin.dto.Admin;
import com.example.cookiecafeadmin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminRepository ar;

    public Admin adminLogin(Admin admin){
        return ar.adminLogin(admin);
    }





}
