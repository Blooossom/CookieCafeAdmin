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
    ProductRepository repo;

    public List<Product> selectProductList(){
        return repo.selectProductList();
    }

    @Transactional
    public String addProduct(Product product){
        int result = 0;
        result += repo.addProduct(product);
        result += repo.addCateMap(product);

        if (result > 0) {
            return "success";
        } else {
            return "failed";
        }
    }
    @Transactional
    public String deleteProducts(Product product) {
        int result = 0;
        result += repo.deleteCateMap(product);
        result += repo.deleteProducts(product);
        System.out.println(repo.deleteProducts(product));
        System.out.println(repo.deleteCateMap(product));
        System.out.println(result);
        if (result > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    public Product selectProduct(String id){
        return repo.selectProduct(id);
    }

    public String updateProduct(Product product){
        int result = 0;
        result += repo.updateProduct(product);
        result += repo.deleteCateMap(product);
        result += repo.addCateMap(product);
        if (result > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

}
