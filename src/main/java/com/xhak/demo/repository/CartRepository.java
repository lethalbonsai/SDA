package com.xhak.demo.repository;

import com.xhak.demo.entities.CartEntity;
import com.xhak.demo.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<CartEntity, Long> {
    List<CartEntity> findAllById(Long id);
    Optional<CartEntity> findByUserId(UserEntity userId);
}
