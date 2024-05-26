package com.xhak.demo.dto.orderDtos;

import com.xhak.demo.dto.userDtos.CreateUserDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CreateOrderDTO {
    private CreateUserDTO user;
    private Long price;
    private String status;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;
}
