package com.example.cookiecafeadmin.controller;


import com.example.cookiecafeadmin.dto.Customer;
import com.example.cookiecafeadmin.dto.Order;
import com.example.cookiecafeadmin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService cs;

    @GetMapping("/customers")
    public List<Customer> selectCustomers(Customer customer){
        return cs.selectCustomers(customer);
    }
    @PutMapping("/customers")
    public String updateCustomer(Customer customer){
        return cs.updateCustomers(customer);
    }

    @GetMapping("/orders")
    public List<Order> selectOrderList(){
        return cs.selectOrderList();
    }
    @GetMapping("/order")
    public List<Order> selectOrderDetail(Order order){
        return cs.selectOrderDetail(order);
    }






}
