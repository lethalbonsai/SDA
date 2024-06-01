package com.xhak.demo.repository;

import com.xhak.demo.entities.ProductEntity;
import com.xhak.demo.entities.ReviewEntity;
import com.xhak.demo.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {
    List<ReviewEntity> findAllByUsername(UserEntity username);
    List<ReviewEntity> findAllByProductId(ProductEntity productId);
    List<ReviewEntity> findAllByRating(Long rating);
    List<ReviewEntity> findAllByCreatedTime(LocalDateTime createdTime);

}
