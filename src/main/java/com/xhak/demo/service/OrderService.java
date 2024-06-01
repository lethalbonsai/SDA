package com.xhak.demo.service;

import com.xhak.demo.dto.orderDtos.CreateOrderDTO;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<CreateOrderDTO> getAllOrders();
    Optional<CreateOrderDTO> getOrderById(Long id);
    Long createOrder(CreateOrderDTO createOrderDTO);
    CreateOrderDTO updateOrder(CreateOrderDTO createOrderDTO);
    String deleteOrder(Long id);
}
