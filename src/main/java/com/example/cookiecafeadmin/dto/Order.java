package com.example.cookiecafeadmin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private int id;
    private String userid;
    private String name;
    private String phone;
    private String address;
    private String addressdetail;
    private String indate;
    private String productName;
    private int price;
    private int amount;
}
