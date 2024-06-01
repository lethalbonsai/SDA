package com.xhak.demo.service;

import com.xhak.demo.dto.orderDtos.CreateOrderDTO;
import com.xhak.demo.dto.orderDtos.ResponseOrderDTO;
import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<ResponseOrderDTO> getAllOrders();
    Optional<ResponseOrderDTO> getOrderById(Long id);
    Long createOrder(CreateOrderDTO createOrderDTO);
    CreateOrderDTO updateOrder(CreateOrderDTO createOrderDTO);
    String deleteOrder(Long id);
}
