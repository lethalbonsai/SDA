package com.xhak.demo.service.impl;

import com.xhak.demo.dto.orderItemDtos.CreateOrderItemDTO;
import com.xhak.demo.dto.orderItemDtos.ResponseOrderItemDTO;
import com.xhak.demo.entities.OrderItemEntity;
import com.xhak.demo.mapper.OrderItemMapper;
import com.xhak.demo.repository.OrderItemRepository;
import com.xhak.demo.service.OrderItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class OrderItemServiceFromDB implements OrderItemService {
    OrderItemRepository orderItemRepository;
    OrderItemMapper orderItemMapper;
    @Override
    public List<ResponseOrderItemDTO> getAllOrderItems() {
        List<OrderItemEntity> responseOrderItemDTOList = orderItemRepository.findAll();
        List<ResponseOrderItemDTO> orderItemEntityList = new ArrayList<>();
        for (OrderItemEntity orderItemEntity : responseOrderItemDTOList) {
            orderItemEntityList.add(orderItemMapper.toResponseOrderItemDTO(orderItemEntity));
        }
        return orderItemEntityList;
    }

    @Override
    public Optional<ResponseOrderItemDTO> getOrderItemById(Long id) {
        OrderItemEntity foundOrderItem = orderItemRepository.findById(id).orElseThrow(
                () -> new RuntimeException("OrderItem with id: " + id + " was not found!"));
        return Optional.of(orderItemMapper.toResponseOrderItemDTO(foundOrderItem));
    }

    @Override
    public Long createOrderItem(CreateOrderItemDTO createOrderItemDTO) {
        OrderItemEntity createOrderItemEntity = orderItemMapper.toMapToOrderItemEntity(createOrderItemDTO);
        OrderItemEntity savedOrderItem = orderItemRepository.save(createOrderItemEntity);
        return savedOrderItem.getId();
    }

    @Override
    public CreateOrderItemDTO updateOrderItem(Long id,CreateOrderItemDTO createOrderItemDTO) {
        OrderItemEntity findOrderItem = orderItemRepository.findById(id).orElseThrow(
                () -> new RuntimeException("OrderItem with id: " + id + " was not found!"));
        orderItemMapper.toMapToOrderItemEntity(createOrderItemDTO);
        OrderItemEntity updatedOrderItem = orderItemRepository.save(findOrderItem);
        return null;
    }

    @Override
    public String deleteOrderItem(Long id) {
        OrderItemEntity orderItemEntity = orderItemRepository.findById(id).orElseThrow(
                () -> new RuntimeException("OrderItem with id: " + id + " was not found!"));
        orderItemRepository.delete(orderItemEntity);
        return "OrderItem with id: " + id + " was successfully deleted!";
    }
}
