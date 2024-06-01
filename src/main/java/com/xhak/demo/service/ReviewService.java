package com.xhak.demo.service;

import com.xhak.demo.dto.reviewDtos.CreateReviewDTO;
import com.xhak.demo.dto.reviewDtos.ResponseReviewDTO;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    List<ResponseReviewDTO> getAllReviews();
    Optional<ResponseReviewDTO> getReviewById(Long id);
    Long createReview(CreateReviewDTO createReviewDTO);
    CreateReviewDTO updateReview(CreateReviewDTO createReviewDTO);
    String deleteReview(Long id);
}
