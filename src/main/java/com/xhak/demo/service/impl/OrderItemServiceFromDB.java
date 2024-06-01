package com.xhak.demo.service.impl;

import com.xhak.demo.dto.orderItemDtos.CreateOrderItemDTO;
import com.xhak.demo.dto.orderItemDtos.ResponseOrderItemDTO;
import com.xhak.demo.mapper.OrderItemMapper;
import com.xhak.demo.repository.OrderItemRepository;
import com.xhak.demo.service.OrderItemService;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class OrderItemServiceFromDB implements OrderItemService {
    OrderItemRepository orderItemRepository;
    OrderItemMapper orderItemMapper;
    @Override
    public List<ResponseOrderItemDTO> getAllOrderItems() {
        return null;
    }

    @Override
    public Optional<ResponseOrderItemDTO> getOrderItemById(Long id) {
        return Optional.empty();
    }

    @Override
    public Long createOrderItem(CreateOrderItemDTO createOrderItemDTO) {
        return null;
    }

    @Override
    public CreateOrderItemDTO updateOrderItem(CreateOrderItemDTO createOrderItemDTO) {
        return null;
    }

    @Override
    public String deleteOrderItem(Long id) {
        return null;
    }
}
