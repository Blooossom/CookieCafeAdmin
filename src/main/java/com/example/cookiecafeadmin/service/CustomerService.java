package com.example.cookiecafeadmin.service;


import com.example.cookiecafeadmin.dto.Customer;
import com.example.cookiecafeadmin.dto.Order;
import com.example.cookiecafeadmin.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository cr;


    public List<Customer> selectCustomers(Customer customer){
        return cr.selectCustomers(customer);
    }

    public String updateCustomers(Customer customer){
        return String.valueOf(cr.updateCustomers(customer));
    }
    public List<Order> selectOrderList(){
        return cr.selectOrderList();
    }

    public List<Order> selectOrderDetail(Order order){
        return cr.selectOrderDetail(order);
    }



}
