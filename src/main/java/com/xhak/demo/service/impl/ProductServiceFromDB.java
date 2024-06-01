package com.xhak.demo.service.impl;

import com.xhak.demo.dto.productdtos.CreateProductDTO;
import com.xhak.demo.dto.productdtos.ResponseProductDTO;
import com.xhak.demo.mapper.ProductMapper;
import com.xhak.demo.repository.ProductRepository;
import com.xhak.demo.service.ProductService;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ProductServiceFromDB implements ProductService {
    ProductRepository productRepository;
    ProductMapper productMapper;
    @Override
    public List<ResponseProductDTO> getAllReviews() {
        return null;
    }

    @Override
    public Optional<ResponseProductDTO> getReviewById(Long id) {
        return Optional.empty();
    }

    @Override
    public Long createProduct(CreateProductDTO createProductDTO) {
        return null;
    }

    @Override
    public CreateProductDTO updateProduct(Long id, CreateProductDTO createProductDTO) {
        return null;
    }

    @Override
    public String deleteProduct(Long id) {
        return null;
    }
}
