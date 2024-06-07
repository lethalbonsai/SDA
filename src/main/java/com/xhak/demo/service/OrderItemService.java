package com.xhak.demo.service;

import com.xhak.demo.dto.orderItemDtos.CreateOrderItemDTO;
import com.xhak.demo.dto.orderItemDtos.ResponseOrderItemDTO;
import java.util.List;
import java.util.Optional;

public interface OrderItemService {
    List<ResponseOrderItemDTO> getAllOrderItems();
    Optional<ResponseOrderItemDTO> getOrderItemById(Long id);
    Long createOrderItem(CreateOrderItemDTO createOrderItemDTO);
    CreateOrderItemDTO updateOrderItem(Long id,CreateOrderItemDTO createOrderItemDTO);
    String deleteOrderItem(Long id);
}
