package com.example.cookiecafeadmin.controller;


import com.example.cookiecafeadmin.dto.SellTime;
import com.example.cookiecafeadmin.service.SellTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SellTimeController {

    @Autowired
    SellTimeService service;


    @GetMapping("/selltimes")
    public List<SellTime> selectSellTimeList(){
        return service.selectSellTimeList();
    }


    @PostMapping("/selltimes")
    public String insertSellTime(SellTime sellTime){
        return service.insertSellTime(sellTime);
    }

    @DeleteMapping("/selltimes")
    public String deleteSellTime(SellTime sellTime){
        return service.deleteSellTime(sellTime);
    }
}
