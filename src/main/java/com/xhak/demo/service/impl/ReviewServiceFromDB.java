package com.xhak.demo.service.impl;

import com.xhak.demo.dto.reviewDtos.CreateReviewDTO;
import com.xhak.demo.dto.reviewDtos.ResponseReviewDTO;
import com.xhak.demo.mapper.ReviewMapper;
import com.xhak.demo.repository.ReviewRepository;
import com.xhak.demo.service.ReviewService;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ReviewServiceFromDB implements ReviewService {
    ReviewRepository reviewRepository;
    ReviewMapper reviewMapper;
    @Override
    public List<ResponseReviewDTO> getAllReviews() {
        return null;
    }

    @Override
    public Optional<ResponseReviewDTO> getReviewById(Long id) {
        return Optional.empty();
    }

    @Override
    public Long createReview(CreateReviewDTO createReviewDTO) {
        return null;
    }

    @Override
    public CreateReviewDTO updateReview(CreateReviewDTO createReviewDTO) {
        return null;
    }

    @Override
    public String deleteReview(Long id) {
        return null;
    }
}
