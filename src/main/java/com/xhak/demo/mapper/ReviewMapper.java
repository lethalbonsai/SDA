package com.xhak.demo.mapper;

import com.xhak.demo.dto.reviewDtos.CreateReviewDTO;
import com.xhak.demo.entities.ReviewEntity;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper {
    ReviewEntity mapToEntity(CreateReviewDTO createReviewDTO){
        ReviewEntity reviewEntity = new ReviewEntity();
        reviewEntity.setComment(createReviewDTO.getComment());
        reviewEntity.setRating(createReviewDTO.getRating());
        reviewEntity.setCreatedTime(createReviewDTO.getCreatedTime());

        return reviewEntity;
    }
}
