package com.xhak.demo.service.impl;

import com.xhak.demo.dto.orderDtos.CreateOrderDTO;
import com.xhak.demo.dto.orderDtos.ResponseOrderDTO;
import com.xhak.demo.mapper.OrderMapper;
import com.xhak.demo.repository.OrderRepository;
import com.xhak.demo.service.OrderService;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class OrderServiceFromDB implements OrderService {
    OrderRepository orderRepository;
    OrderMapper orderMapper;
    @Override
    public List<ResponseOrderDTO> getAllOrders() {
        return null;
    }

    @Override
    public Optional<ResponseOrderDTO> getOrderById(Long id) {
        return Optional.empty();
    }

    @Override
    public Long createOrder(CreateOrderDTO createOrderDTO) {
        return null;
    }

    @Override
    public CreateOrderDTO updateOrder(CreateOrderDTO createOrderDTO) {
        return null;
    }

    @Override
    public String deleteOrder(Long id) {
        return null;
    }
}
