package com.xhak.demo.repository;

import com.xhak.demo.entities.OrderEntity;
import com.xhak.demo.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
    List<OrderEntity> findAllById(Long id);
    List<OrderEntity> findAllByOrderDate(LocalDateTime orderDate);
    List<OrderEntity> findAllByStatus(String status);
    List<OrderEntity> findAllByDeliveryDate(LocalDateTime deliveryDate);
    List<OrderEntity> findAllByUserId(UserEntity userId);
    Optional<OrderEntity> findByUserId(UserEntity userId);
}
