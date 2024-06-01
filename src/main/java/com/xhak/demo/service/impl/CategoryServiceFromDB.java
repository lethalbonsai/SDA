package com.xhak.demo.service.impl;

import com.xhak.demo.dto.categoryDtos.CreateCategoryDTO;
import com.xhak.demo.dto.categoryDtos.ResponseCategoryDTO;
import com.xhak.demo.mapper.CategoryMapper;
import com.xhak.demo.repository.CategoryRepository;
import com.xhak.demo.service.CategoryService;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class CategoryServiceFromDB implements CategoryService {
    CategoryRepository categoryRepository;
    CategoryMapper categoryMapper;
    @Override
    public List<ResponseCategoryDTO> getAllCategories() {
        return null;
    }

    @Override
    public Optional<ResponseCategoryDTO> getCategoryById(Long id) {
        return Optional.empty();
    }

    @Override
    public Long createCategory(CreateCategoryDTO category) {
        return null;
    }

    @Override
    public CreateCategoryDTO updateCategory(CreateCategoryDTO category) {
        return null;
    }

    @Override
    public String deleteCategory(Long id) {
        return null;
    }
}
