package com.xhak.demo.dto.orderDtos;

import java.time.LocalDateTime;

public class ResponseOrderDTO {
    private Long id;
    private Long price;
    private String status;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;
    private Long userId;
}
