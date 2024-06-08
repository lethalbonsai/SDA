package com.xhak.demo.mapper;

import com.xhak.demo.dto.reviewDtos.CreateReviewDTO;
import com.xhak.demo.dto.reviewDtos.ResponseReviewDTO;
import com.xhak.demo.entities.ReviewEntity;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper {
    public ResponseReviewDTO toResponseReviewDTO(ReviewEntity reviewEntity){
        ResponseReviewDTO responseReviewDTO = new ResponseReviewDTO();
        responseReviewDTO.setId(reviewEntity.getId());
        responseReviewDTO.setRating(reviewEntity.getRating());
        responseReviewDTO.setComment(reviewEntity.getComment());
        responseReviewDTO.setCreatedTime(reviewEntity.getCreatedTime());
        return responseReviewDTO;
    }
    public ReviewEntity toMapToReviewEntity(CreateReviewDTO createReviewDTO){
        ReviewEntity reviewEntity = new ReviewEntity();
        reviewEntity.setRating(createReviewDTO.getRating());
        reviewEntity.setComment(createReviewDTO.getComment());
        reviewEntity.setCreatedTime(createReviewDTO.getCreatedTime());
        return reviewEntity;
    }

    public CreateReviewDTO toMapToCreateReviewEntity(ReviewEntity reviewEntity){
        CreateReviewDTO createReviewDTO = new CreateReviewDTO();
        createReviewDTO.setRating(reviewEntity.getRating());
        createReviewDTO.setComment(reviewEntity.getComment());
        createReviewDTO.setCreatedTime(reviewEntity.getCreatedTime());
        return createReviewDTO;
    }
}
