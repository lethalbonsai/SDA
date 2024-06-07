package com.xhak.demo.service.impl;

import com.xhak.demo.dto.categoryDtos.CreateCategoryDTO;
import com.xhak.demo.dto.categoryDtos.ResponseCategoryDTO;
import com.xhak.demo.entities.CategoryEntity;
import com.xhak.demo.mapper.CategoryMapper;
import com.xhak.demo.repository.CategoryRepository;
import com.xhak.demo.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CategoryServiceFromDB implements CategoryService {
    CategoryRepository categoryRepository;
    CategoryMapper categoryMapper;
    @Override
    public List<ResponseCategoryDTO> getAllCategories() {
        List<CategoryEntity> categoryList = categoryRepository.findAll();
        List<ResponseCategoryDTO> responseCategoryDTOList = new ArrayList<>();
        for (CategoryEntity categoryEntity : categoryList) {
            responseCategoryDTOList.add(categoryMapper.toResponseCategoryDTO(categoryEntity));
        }
        return responseCategoryDTOList;
    }

    @Override
    public Optional<ResponseCategoryDTO> getCategoryById(Long id) {
        CategoryEntity foundCategory = categoryRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Category with id: " + id + " was not found!"));
        return Optional.of(categoryMapper.toResponseCategoryDTO(foundCategory));
    }

    @Override
    public Long createCategory(CreateCategoryDTO createCategoryDTO) {
        CategoryEntity createCategoryEntity = categoryMapper.toMapToCategoryEntity(createCategoryDTO);
        CategoryEntity savedCategory = categoryRepository.save(createCategoryEntity);
        return null;
    }

    @Override
    public CreateCategoryDTO updateCategory(Long id,CreateCategoryDTO createCategoryDTO) {
        CategoryEntity findCategory = categoryRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Category with id: " + id + " was not found!"));
        categoryMapper.toMapToCategoryEntity(createCategoryDTO);
        CategoryEntity updatedCategory = categoryRepository.save(findCategory);
        return categoryMapper.toMapToCreateCategoryEntity(updatedCategory);
    }

    @Override
    public String deleteCategory(Long id) {
        CategoryEntity categoryEntity = categoryRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Category with id: " + id + " was not found!"));
        categoryRepository.delete(categoryEntity);
        return "Category with id: " + id + " was successfully deleted!";
    }
}
