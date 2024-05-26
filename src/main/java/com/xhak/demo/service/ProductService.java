package com.xhak.demo.service;

import com.xhak.demo.dto.productdtos.CreateProductDTO;

import java.util.List;

public interface ProductService {
    List<CreateProductDTO> getAllReviews();
    CreateProductDTO getReviewById(Long id);
    Long createProduct(CreateProductDTO createProductDTO);
    CreateProductDTO updateProduct(Long id, CreateProductDTO createProductDTO);
    String deleteProduct(Long id);
}
