package com.xhak.demo.mapper;

import com.xhak.demo.dto.productdtos.CreateProductDTO;
import com.xhak.demo.entities.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
   public ProductEntity mapToEntity(CreateProductDTO createProductDTO){
       ProductEntity productEntity = new ProductEntity();
       productEntity.setTitle(createProductDTO.getTitle());
       productEntity.setDescription(createProductDTO.getDescription());
       productEntity.setPrice(createProductDTO.getPrice());
       productEntity.setQuantity(createProductDTO.getQuantity());
       productEntity.setProductType(createProductDTO.getProductType().getProductType());
       productEntity.setCategory(createProductDTO.getProductType().getCategory());
       return productEntity;
   }
}
