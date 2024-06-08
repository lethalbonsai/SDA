package com.xhak.demo.service.impl;

import com.xhak.demo.dto.orderDtos.CreateOrderDTO;
import com.xhak.demo.dto.orderDtos.ResponseOrderDTO;
import com.xhak.demo.entities.OrderEntity;
import com.xhak.demo.mapper.OrderMapper;
import com.xhak.demo.repository.OrderRepository;
import com.xhak.demo.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class OrderServiceFromDB implements OrderService {
    OrderRepository orderRepository;
    OrderMapper orderMapper;
    @Override
    public List<ResponseOrderDTO> getAllOrders() {
        List<OrderEntity> orderList = orderRepository.findAll();
        List<ResponseOrderDTO> responseOrderDTOList = new ArrayList<>();
        for (OrderEntity orderEntity : orderList) {
            responseOrderDTOList.add(orderMapper.toResponseOrderDTO(orderEntity));
        }
        return responseOrderDTOList;
    }

    @Override
    public Optional<ResponseOrderDTO> getOrderById(Long id) {
        OrderEntity foundOrder = orderRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Order with id: " + id + " was not found!"));
        return Optional.of(orderMapper.toResponseOrderDTO(foundOrder));
    }

    @Override
    public Long createOrder(CreateOrderDTO createOrderDTO) {
        OrderEntity createOrderEntity = orderMapper.mapToOrderEntity(createOrderDTO);
        OrderEntity savedOrder = orderRepository.save(createOrderEntity);
        return savedOrder.getId();
    }

    @Override
    public CreateOrderDTO updateOrder(Long id, CreateOrderDTO createOrderDTO) {
        OrderEntity findOrder = orderRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Order with id: " + id + " was not found!"));
        orderMapper.mapToOrderEntity(createOrderDTO);
        OrderEntity updatedOrder = orderRepository.save(findOrder);
        return orderMapper.mapToCreateOrderEntity(updatedOrder);
    }

    @Override
    public String deleteOrder(Long id) {
        OrderEntity orderEntity = orderRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Order with id: " + id + " was not found!"));
        orderRepository.delete(orderEntity);
        return "Order with id: " + id + " was successfully deleted!";
    }
}
