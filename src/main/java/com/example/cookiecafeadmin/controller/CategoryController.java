package com.example.cookiecafeadmin.controller;


import com.example.cookiecafeadmin.dto.Category;
import com.example.cookiecafeadmin.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService service;

    @GetMapping("/categories")
    public List<Category> selectCategoryList(){
        return service.selectCategoryList();
    }

    @PostMapping("/categories")
    public String addCategory(Category category){
        return service.addCategory(category);
    }

    @PutMapping("/categories")
    public String updateCategory(Category category){
        return service.updateCategory(category);
    }

    @DeleteMapping("/categories")
    public String deleteCategory(Category category){
        return service.deleteCategory(category);
    }





}
