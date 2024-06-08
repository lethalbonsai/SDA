package com.xhak.demo.service.impl;

import com.xhak.demo.dto.reviewDtos.CreateReviewDTO;
import com.xhak.demo.dto.reviewDtos.ResponseReviewDTO;
import com.xhak.demo.entities.AddressEntity;
import com.xhak.demo.entities.ReviewEntity;
import com.xhak.demo.mapper.ReviewMapper;
import com.xhak.demo.repository.ReviewRepository;
import com.xhak.demo.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ReviewServiceFromDB implements ReviewService {
    ReviewRepository reviewRepository;
    ReviewMapper reviewMapper;
    @Override
    public List<ResponseReviewDTO> getAllReviews() {
        List<ReviewEntity> reviewList = reviewRepository.findAll();
        List<ResponseReviewDTO> responseReviewDTOList = new ArrayList<>();
        for (ReviewEntity reviewEntity : reviewList) {
            responseReviewDTOList.add(reviewMapper.toResponseReviewDTO(reviewEntity));
        }
        return responseReviewDTOList;
    }

    @Override
    public Optional<ResponseReviewDTO> getReviewById(Long id) {
        ReviewEntity foundReview = reviewRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Review with id: " + id + " was not found!"));
        return Optional.of(reviewMapper.toResponseReviewDTO(foundReview));
    }

    @Override
    public Long createReview(CreateReviewDTO createReviewDTO) {
        ReviewEntity createReviewEntity = reviewMapper.toMapToReviewEntity(createReviewDTO);
        ReviewEntity savedReview = reviewRepository.save(createReviewEntity);
        return savedReview.getId();
    }

    @Override
    public CreateReviewDTO updateReview(Long id, CreateReviewDTO createReviewDTO) {
        ReviewEntity findReview = reviewRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Review with id: " + id + " was not found!"));
        reviewMapper.toMapToReviewEntity(createReviewDTO);
        ReviewEntity updatedReview = reviewRepository.save(findReview);
        return reviewMapper.toMapToCreateReviewEntity(updatedReview);
    }

    @Override
    public String deleteReview(Long id) {
        ReviewEntity reviewEntity = reviewRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Review with id: " + id + " was not found!"));
        reviewRepository.delete(reviewEntity);
        return "Review with id: " + id + " was successfully deleted!";
    }
}
