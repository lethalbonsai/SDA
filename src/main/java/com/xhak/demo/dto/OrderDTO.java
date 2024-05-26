package com.xhak.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class OrderDTO {
    private Long id;
    private UserDTO user;
    private Long price;
    private String status;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;
}
