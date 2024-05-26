package com.xhak.demo.service;

import java.util.List;

public interface ReviewService {
    List<ReviewService> getAllReviews();
    ReviewService getReviewById(Long id);
    ReviewService createReview(ReviewService reviewService);
    ReviewService updateReview(ReviewService reviewService);
    ReviewService deleteReview(Long id);
}
