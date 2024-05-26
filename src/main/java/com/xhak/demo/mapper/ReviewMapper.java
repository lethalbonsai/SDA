package com.xhak.demo.mapper;

import com.xhak.demo.dto.ReviewDtos.ReviewDTO;
import com.xhak.demo.entities.ReviewEntity;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper {
    ReviewEntity mapToEntity(ReviewDTO reviewDTO){
        ReviewEntity reviewEntity = new ReviewEntity();
        reviewEntity.setComment(reviewDTO.getComment());
        reviewEntity.setRating(reviewDTO.getRating());
        reviewEntity.setCreatedTime(reviewDTO.getCreatedTime());

        return reviewEntity;
    }
}
