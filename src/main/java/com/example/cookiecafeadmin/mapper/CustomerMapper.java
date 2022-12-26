package com.example.cookiecafeadmin.mapper;


import com.example.cookiecafeadmin.dto.Customer;
import com.example.cookiecafeadmin.dto.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {

    public List<Customer> selectCustomers(Customer customer);
    public int updateCustomers(Customer customer);
    public List<Order> selectOrderList();

    public List<Order> selectOrderDetail(Order order);





}
