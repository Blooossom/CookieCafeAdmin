package com.example.cookiecafeadmin.mapper;


import com.example.cookiecafeadmin.dto.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    public List<Product> selectProductList();

    public int addCateMap(Product product);

    public int addProduct(Product product);



}
