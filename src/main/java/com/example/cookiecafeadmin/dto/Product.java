package com.example.cookiecafeadmin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    private int id;
    private String productName;
    private String thumb;
    private int orderNum;
    private int price;
    private String status;
    private int amount;
    private String content;
    private String summary;
    private String marketType;
    private String indate;
    private int cateId;
    private String cateName;


}
