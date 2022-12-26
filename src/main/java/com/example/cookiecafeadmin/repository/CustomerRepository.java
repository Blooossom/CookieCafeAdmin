package com.example.cookiecafeadmin.repository;


import com.example.cookiecafeadmin.dto.Customer;
import com.example.cookiecafeadmin.dto.Order;
import com.example.cookiecafeadmin.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    @Autowired
    CustomerMapper mapper;

    public List<Customer> selectCustomers(Customer customer){
        return mapper.selectCustomers(customer);
    }
    public int updateCustomers(Customer customer){
        return mapper.updateCustomers(customer);
    }

    public List<Order> selectOrderList(){
        return mapper.selectOrderList();
    }

    public List<Order> selectOrderDetail(Order order){
        return mapper.selectOrderDetail(order);
    }


}
