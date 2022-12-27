package com.example.cookiecafeadmin.mapper;

import com.example.cookiecafeadmin.dto.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {


    public List<Category> selectCategoryList();

    public int addCategory(Category category);

    public int updateCategory(Category category);

    public int deleteCategory(Category category);




}
