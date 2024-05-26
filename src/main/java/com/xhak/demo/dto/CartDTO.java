package com.xhak.demo.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CartDTO {
    private Long id;
    private UserDTO user;
    private List<OrderItemDTO> orderItems;
}
