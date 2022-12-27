package com.example.cookiecafeadmin.controller;


import com.example.cookiecafeadmin.dto.Product;
import com.example.cookiecafeadmin.dto.SellTime;
import com.example.cookiecafeadmin.service.PictureService;
import com.example.cookiecafeadmin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @Autowired
    PictureService ps;

    @PostMapping("/pictures")
    public String insertPictures(@RequestParam("filedata")MultipartFile filedata) throws IOException{
        return ps.uploadPic(filedata);
    }

    @GetMapping("/products")
    public List<Product> selectProductList(){
        return service.selectProductList();
    }

    @PostMapping("/products")
    public String addProduct(Product product){
        return service.addProduct(product);
    }
    @PutMapping("/products")
    public String updateProducts(Product product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/products")
    public String deleteProducts(Product product){
        return service.deleteProducts(product);
    }
    @GetMapping("/products/{id}")
    public Product selectProduct(@PathVariable String id){
        return service.selectProduct(id);
    }


}
/*













 */
