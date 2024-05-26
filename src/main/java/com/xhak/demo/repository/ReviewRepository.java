package com.xhak.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<ReviewRepository, Long> {
    Optional<ReviewRepository> findByProductId(Long productId);
}
