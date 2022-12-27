package com.example.cookiecafeadmin.repository;


import com.example.cookiecafeadmin.dto.SellTime;
import com.example.cookiecafeadmin.mapper.SellTimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SellTimeRepository {

    @Autowired
    SellTimeMapper mapper;

    public List<SellTime> selectSellTimeList(){
        return mapper.selectSellTimeList();
    }

    public int insertSellTimes(SellTime sellTime){
        return mapper.insertSellTimes(sellTime);
    }

    public int deleteSellTime(SellTime sellTime){
        return mapper.deleteSellTime(sellTime);
    }


}
