package com.xhak.demo.repository;

import com.xhak.demo.entities.ProductEntity;
import com.xhak.demo.entities.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
    Optional<ProductEntity> findByProductId(Long productId);
}
