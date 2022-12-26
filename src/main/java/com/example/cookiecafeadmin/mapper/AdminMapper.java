package com.example.cookiecafeadmin.mapper;

import com.example.cookiecafeadmin.dto.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

    public Admin adminLogin(Admin admin);

}
