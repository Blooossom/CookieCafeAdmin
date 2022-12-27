package com.example.cookiecafeadmin.service;


import com.example.cookiecafeadmin.dto.Category;
import com.example.cookiecafeadmin.repository.CategoryRepository;
import com.example.cookiecafeadmin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repo;

    @Autowired
    ProductRepository prepo;

    public List<Category> selectCategoryList(){
        return repo.selectCategoryList();
    }

    public String addCategory(Category category) {
        int result = 0;
        result += repo.addCategory(category);
        if(result == 1) {
            return "success";
        } else {
            return "failed";
        }
    }
    public String updateCategory(Category category) {
        int result = 0;
        result += repo.updateCategory(category);
        if(result == 1) {
            return "success";
        } else {
            return "failed";
        }
    }
    @Transactional
    public String deleteCategory(Category category) {
        int result = 0;
        result += repo.deleteCategory(category);
        result += repo.deleteCateMap(category);
        if(result > 0) {
            return "success";
        } else {
            return "failed";
        }
    }


}
