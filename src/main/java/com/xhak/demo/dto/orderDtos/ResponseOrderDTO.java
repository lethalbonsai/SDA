package com.xhak.demo.dto.orderDtos;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseOrderDTO {
    private Long id;
    private Long price;
    private String status;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;
    private Long userId;
}
