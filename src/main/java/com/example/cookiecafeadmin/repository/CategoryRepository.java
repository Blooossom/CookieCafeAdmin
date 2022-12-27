package com.example.cookiecafeadmin.repository;


import com.example.cookiecafeadmin.dto.Category;
import com.example.cookiecafeadmin.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepository {

    @Autowired
    CategoryMapper mapper;

    public List<Category> selectCategoryList(){
        return mapper.selectCategoryList();
    }

    public int addCategory(Category category){
        return mapper.addCategory(category);
    }

    public int updateCategory(Category category){
        return mapper.updateCategory(category);
    }

    public int deleteCategory(Category category){
        return mapper.deleteCategory(category);
    }


}
