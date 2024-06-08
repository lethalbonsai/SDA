package com.xhak.demo.controllers;

import com.xhak.demo.dto.reviewDtos.CreateReviewDTO;
import com.xhak.demo.dto.reviewDtos.ResponseReviewDTO;
import com.xhak.demo.service.ReviewService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/review")
public class ReviewController {
    private ReviewService reviewService;

    @GetMapping("{id}")
    public ResponseEntity<ResponseReviewDTO> getReviewById(@PathVariable Long id) {
        Optional<ResponseReviewDTO> review = reviewService.getReviewById(id);
        if (review.isPresent()) {
            return ResponseEntity.ok(review.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Long> createReview(@RequestBody CreateReviewDTO review) {
        return ResponseEntity.ok(reviewService.createReview(review));
    }
    @PutMapping("{id}")
    public ResponseEntity<CreateReviewDTO> updateReview(@PathVariable Long id, @RequestBody CreateReviewDTO review) {
        return ResponseEntity.ok(reviewService.updateReview(id, review));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteReview(@PathVariable Long id) {
        return ResponseEntity.ok(reviewService.deleteReview(id));
    }
}
