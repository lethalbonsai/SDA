package com.xhak.demo.dto.cartDtos;

import com.xhak.demo.entities.OrderItemEntity;

import java.util.List;

public class ResponseCartDTO {
    private Long id;
    private Long userId;
    private List<OrderItemEntity> orderItemsList;
}
