package com.xhak.demo.service;

import com.xhak.demo.dto.productdtos.CreateProductDTO;
import com.xhak.demo.dto.productdtos.ResponseProductDTO;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ResponseProductDTO> getAllReviews();
    Optional<ResponseProductDTO> getReviewById(Long id);
    Long createProduct(CreateProductDTO createProductDTO);
    CreateProductDTO updateProduct(Long id, CreateProductDTO createProductDTO);
    String deleteProduct(Long id);
}
