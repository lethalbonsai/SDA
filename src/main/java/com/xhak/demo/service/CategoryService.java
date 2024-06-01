package com.xhak.demo.service;

import com.xhak.demo.dto.categoryDtos.CreateCategoryDTO;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CreateCategoryDTO> getAllCategories();
    Optional<CreateCategoryDTO> getCategoryById(Long id);
    Long createCategory(CreateCategoryDTO category);
    CreateCategoryDTO updateCategory(CreateCategoryDTO category);
    String deleteCategory(Long id);
}
