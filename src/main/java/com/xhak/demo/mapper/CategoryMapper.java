package com.xhak.demo.mapper;

import com.xhak.demo.dto.categoryDtos.CreateCategoryDTO;
import com.xhak.demo.dto.categoryDtos.ResponseCategoryDTO;
import com.xhak.demo.entities.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public ResponseCategoryDTO toResponseCategoryDTO(CategoryEntity categoryEntity) {
        ResponseCategoryDTO responseCategoryDTO = new ResponseCategoryDTO();
        responseCategoryDTO.setId(categoryEntity.getId());
        responseCategoryDTO.setName(categoryEntity.getName());
        return responseCategoryDTO;
    }

    public CategoryEntity toMapToCategoryEntity(CreateCategoryDTO createCategoryDTO) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName(categoryEntity.getName());
        return categoryEntity;
    }

    public CreateCategoryDTO toMapToCreateCategoryEntity(CategoryEntity categoryEntity) {
        CreateCategoryDTO createCategoryDTO = new CreateCategoryDTO();
        createCategoryDTO.setName(categoryEntity.getName());
        return createCategoryDTO;
    }
}
