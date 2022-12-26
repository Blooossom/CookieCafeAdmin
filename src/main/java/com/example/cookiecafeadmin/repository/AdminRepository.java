package com.example.cookiecafeadmin.repository;

import com.example.cookiecafeadmin.dto.Admin;
import com.example.cookiecafeadmin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepository {

    @Autowired
    AdminMapper mapper;

    public Admin adminLogin(Admin admin){
        return mapper.adminLogin(admin);
    }



}
