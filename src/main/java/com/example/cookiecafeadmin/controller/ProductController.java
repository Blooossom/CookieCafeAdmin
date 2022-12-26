package com.example.cookiecafeadmin.controller;


import com.example.cookiecafeadmin.dto.Product;
import com.example.cookiecafeadmin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService ps;

    @PostMapping("/pictures")

    @GetMapping("/products")
    public List<Product> selectProductList(){
        return ps.selectProductList();
    }

    @PostMapping("/products")
    public String addProduct(Product product){
        return ps.addProduct(product);
    }

}
/*


    @PutMapping("/products")

    @DeleteMapping("/products")

    @GetMapping("/products/{id}")

    @GetMapping("/selltimes")

    @PostMapping("/selltimes")

    @DeleteMapping("/selltimes")
 */
