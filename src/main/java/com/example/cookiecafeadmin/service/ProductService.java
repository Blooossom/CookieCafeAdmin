package com.example.cookiecafeadmin.service;


import com.example.cookiecafeadmin.dto.Product;
import com.example.cookiecafeadmin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository pr;

    public List<Product> selectProductList(){
        return pr.selectProductList();
    }

    @Transactional
    public String addProduct(Product product){
        int result = 0;
        result += pr.addProduct(product);
        result += pr.addCateMap(product);

        if (result > 0) {
            return "success";
        } else {
            return "failed";
        }
    }



}
