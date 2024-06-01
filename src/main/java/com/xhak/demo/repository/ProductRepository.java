package com.xhak.demo.repository;

import com.xhak.demo.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
    List<ProductEntity> findAllById(Long id);
    List<ProductEntity> findAllByCategory(String category);
    List<ProductEntity> findAllByPrice(Double price);
    Optional<ProductEntity> findById(Long id);
}
