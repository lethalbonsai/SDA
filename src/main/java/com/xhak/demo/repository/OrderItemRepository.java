package com.xhak.demo.repository;

import com.xhak.demo.entities.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity,Long> {
    List<OrderItemEntity> findAllById(Long id);
    Optional<OrderItemEntity> findByProductId(Long productId);
    Optional<OrderItemEntity> findByCartId(Long cartId);
}
