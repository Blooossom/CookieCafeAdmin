package com.example.cookiecafeadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.cookiecafeadmin.mapper"})
public class CookieCafeAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CookieCafeAdminApplication.class, args);
    }

}
