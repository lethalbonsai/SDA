package com.xhak.demo.mapper;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.productdtos.CreateProductDTO;
import com.xhak.demo.dto.productdtos.ResponseProductDTO;
import com.xhak.demo.entities.AddressEntity;
import com.xhak.demo.entities.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
   public ResponseProductDTO toResponseProductDTO(ProductEntity productEntity) {
      ResponseProductDTO responseProductDTO = new ResponseProductDTO();
      responseProductDTO.setId(productEntity.getId());
      responseProductDTO.setTitle(productEntity.getTitle());
      responseProductDTO.setDescription(productEntity.getDescription());
      responseProductDTO.setPrice(productEntity.getPrice());
      responseProductDTO.setQuantity(productEntity.getQuantity());
      responseProductDTO.setProductType(productEntity.getProductType());
      return responseProductDTO;
   }

   public ProductEntity toMapProductEntity(CreateProductDTO createProductDTO) {
      ProductEntity productEntity = new ProductEntity();
      productEntity.setTitle(createProductDTO.getTitle());
      productEntity.setDescription(createProductDTO.getDescription());
      productEntity.setPrice(createProductDTO.getPrice());
      productEntity.setQuantity(createProductDTO.getQuantity());
      productEntity.setProductType(createProductDTO.getProductType());
      return productEntity;
   }

   public CreateProductDTO toMapToCreateProductEntity(ProductEntity addressEntity) {
      CreateProductDTO createProductDTO = new CreateProductDTO();
      createProductDTO.setTitle(addressEntity.getTitle());
      createProductDTO.setDescription(addressEntity.getDescription());
      createProductDTO.setPrice(addressEntity.getPrice());
      createProductDTO.setQuantity(addressEntity.getQuantity());
      createProductDTO.setProductType(addressEntity.getProductType());
      return createProductDTO;
   }
}
