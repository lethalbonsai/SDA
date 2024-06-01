package com.xhak.demo.service;

import com.xhak.demo.dto.orderItemDtos.CreateOrderItemDTO;

import java.util.List;
import java.util.Optional;

public interface OrderItemService {
    List<CreateOrderItemDTO> getAllOrderItems();
    Optional<CreateOrderItemDTO> getOrderItemById(Long id);
    Long createOrderItem(CreateOrderItemDTO createOrderItemDTO);
    CreateOrderItemDTO updateOrderItem(CreateOrderItemDTO createOrderItemDTO);
    String deleteOrderItem(Long id);
}
