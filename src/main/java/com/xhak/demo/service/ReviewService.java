package com.xhak.demo.service;

import com.xhak.demo.dto.reviewDtos.CreateReviewDTO;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    List<CreateReviewDTO> getAllReviews();
    Optional<CreateReviewDTO> getReviewById(Long id);
    Long createReview(CreateReviewDTO createReviewDTO);
    CreateReviewDTO updateReview(CreateReviewDTO createReviewDTO);
    String deleteReview(Long id);
}
