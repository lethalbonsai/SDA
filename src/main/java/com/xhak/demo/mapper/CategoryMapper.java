package com.xhak.demo.mapper;

import com.xhak.demo.dto.categoryDtos.ResponseCategoryDTO;
import com.xhak.demo.entities.CategoryEntity;

public class CategoryMapper {
    public ResponseCategoryDTO mapToDto(CategoryEntity categoryEntity) {
        ResponseCategoryDTO responseCategoryDTO = new ResponseCategoryDTO();
        responseCategoryDTO.setId(categoryEntity.getId());
        responseCategoryDTO.setName(categoryEntity.getName());
        return responseCategoryDTO;
    }

    public CategoryEntity mapToEntity(){
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName(categoryEntity.getName());
        return categoryEntity;
    }
}
