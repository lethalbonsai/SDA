package com.xhak.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "REVIEW")
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserEntity username;
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private ProductEntity product;
    @Column(name = "RATING")
    private Long rating;
    @Column(name = "COMMENT")
    private String comment;
    @CreationTimestamp
    @Column(name = "CREATED_TIME")
    private LocalDateTime createdTime;
}
