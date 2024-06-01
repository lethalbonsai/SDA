package com.xhak.demo.service;

import com.xhak.demo.dto.categoryDtos.CreateCategoryDTO;
import com.xhak.demo.dto.categoryDtos.ResponseCategoryDTO;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<ResponseCategoryDTO> getAllCategories();
    Optional<ResponseCategoryDTO> getCategoryById(Long id);
    Long createCategory(CreateCategoryDTO category);
    CreateCategoryDTO updateCategory(CreateCategoryDTO category);
    String deleteCategory(Long id);
}
