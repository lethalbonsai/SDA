package com.xhak.demo.service.impl;

import com.xhak.demo.dto.productdtos.CreateProductDTO;
import com.xhak.demo.dto.productdtos.ResponseProductDTO;
import com.xhak.demo.entities.ProductEntity;
import com.xhak.demo.mapper.ProductMapper;
import com.xhak.demo.repository.ProductRepository;
import com.xhak.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProductServiceFromDB implements ProductService {
    ProductRepository productRepository;
    ProductMapper productMapper;
    @Override
    public List<ResponseProductDTO> getAllProducts() {
        List<ProductEntity> productList = productRepository.findAll();
        List<ResponseProductDTO> responseProductDTOList = new ArrayList<>();
        for (ProductEntity productEntity : productList) {
            responseProductDTOList.add(productMapper.toResponseProductDTO(productEntity));
        }
        return responseProductDTOList;
    }

    @Override
    public Optional<ResponseProductDTO> getProductById(Long id) {
        ProductEntity foundProduct = productRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Product with id: " + id + " was not found!"));
        return Optional.of(productMapper.toResponseProductDTO(foundProduct));
    }

    @Override
    public Long createProduct(CreateProductDTO createProductDTO) {
        ProductEntity createProductEntity = productMapper.toMapProductEntity(createProductDTO);
        ProductEntity savedProduct = productRepository.save(createProductEntity);
        return savedProduct.getId();
    }

    @Override
    public CreateProductDTO updateProduct(Long id, CreateProductDTO createProductDTO) {
        ProductEntity findProduct = productRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Product with id: " + id + " was not found!"));
        productMapper.toMapProductEntity(createProductDTO);
        ProductEntity updatedProduct = productRepository.save(findProduct);
        return productMapper.toMapToCreateProductEntity(updatedProduct);
    }

    @Override
    public String deleteProduct(Long id) {
        ProductEntity productEntity = productRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Product with id: " + id + " was not found!"));
        productRepository.delete(productEntity);
        return "Product with id: " + id + " was successfully deleted!";
    }
}
