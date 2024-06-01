package com.xhak.demo.repository;

import com.xhak.demo.entities.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<CartEntity, Long> {
    List<CartEntity> findAllById(Long id);
    Optional<CartEntity> findByUserId(Long userId);
}
