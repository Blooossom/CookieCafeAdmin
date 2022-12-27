package com.example.cookiecafeadmin.service;


import com.example.cookiecafeadmin.dto.SellTime;
import com.example.cookiecafeadmin.repository.SellTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellTimeService {

    @Autowired
    SellTimeRepository repo;

    public List<SellTime> selectSellTimeList(){
        return repo.selectSellTimeList();
    }

    public String insertSellTimes(SellTime sellTime){
        int result = 0;
        result += repo.insertSellTimes(sellTime);
        if (result == 1) {
            return "success";
        } else {
            return "failed";
        }
    }

    public String deleteSellTime(SellTime sellTime){
        int result = 0;
        result += repo.deleteSellTime(sellTime);
        if (result == 1) {
            return "success";
        } else {
            return "failed";
        }
    }
}
