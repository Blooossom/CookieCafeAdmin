package com.example.cookiecafeadmin.service;


import com.example.cookiecafeadmin.dto.Category;
import com.example.cookiecafeadmin.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repo;


    public List<Category> selectCategoryList(){
        return repo.selectCategoryList();
    }

    public String addCategory(Category category) {
        int result = 0;
        result += repo.addCategory(category);
        if(result > 0) {
            return "success";
        } else {
            return "failed";
        }
    }
    public String updateCategory(Category category) {
        int result = 0;
        result += repo.updateCategory(category);
        if(result > 0) {
            return "success";
        } else {
            return "failed";
        }
    }
    public String deleteCategory(Category category) {
        int result = 0;
        result += repo.deleteCategory(category);
        if(result > 0) {
            return "success";
        } else {
            return "failed";
        }
    }


}
