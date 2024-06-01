package com.xhak.demo.repository;

import com.xhak.demo.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
    List<OrderEntity> findAllById(Long id);
    List<OrderEntity> findAllByOrderDate(String orderDate);
    List<OrderEntity> findAllByOrderStatus(String orderStatus);
    List<OrderEntity> findAllByDeliveryDate(String deliveryDate);
    List<OrderEntity> findAllByUserId(Long userId);
    Optional<OrderEntity> findByUserId(Long userId);
}
