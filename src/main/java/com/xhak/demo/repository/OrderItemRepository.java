package com.xhak.demo.repository;

import com.xhak.demo.entities.CartEntity;
import com.xhak.demo.entities.OrderItemEntity;
import com.xhak.demo.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity,Long> {
    List<OrderItemEntity> findAllById(Long id);
    Optional<OrderItemEntity> findByProductId(ProductEntity productId);
    Optional<OrderItemEntity> findByCartId(CartEntity cartId);
}
