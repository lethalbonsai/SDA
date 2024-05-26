package com.xhak.demo.services;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllReviews();
    ProductDTO getReviewById(Long id);
    Long createProduct(ProductDTO productDTO);
    ProductDTO updateProduct(Long id, ProductDTO productDTO);
    String deleteProduct(Long id);
}
