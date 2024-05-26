package com.xhak.demo.repository;

import com.xhak.demo.entities.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {
    Optional<ReviewRepository> findByProductId(Long productId);
}
