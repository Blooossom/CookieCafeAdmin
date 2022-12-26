package com.example.cookiecafeadmin.repository;


import com.example.cookiecafeadmin.dto.Product;
import com.example.cookiecafeadmin.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    ProductMapper mapper;



    public List<Product> selectProductList(){
        return mapper.selectProductList();
    }

    public int addCateMap(Product product){
        return mapper.addCateMap(product);
    }

    public int addProduct(Product product){
        return mapper.addProduct(product);
    }


}
