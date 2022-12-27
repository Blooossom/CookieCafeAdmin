package com.example.cookiecafeadmin.mapper;

import com.example.cookiecafeadmin.dto.SellTime;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SellTimeMapper {

    public List<SellTime> selectSellTimeList();

    public int insertSellTimes(SellTime sellTime);

    public int deleteSellTime(SellTime sellTime);

}
