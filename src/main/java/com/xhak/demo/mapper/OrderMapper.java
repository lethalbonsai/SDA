package com.xhak.demo.mapper;

import com.xhak.demo.dto.orderDtos.CreateOrderDTO;
import com.xhak.demo.dto.orderDtos.ResponseOrderDTO;
import com.xhak.demo.entities.OrderEntity;

public class OrderMapper {
    public ResponseOrderDTO toResponseOrderDTO(OrderEntity orderEntity){
        ResponseOrderDTO responseOrderDTO = new ResponseOrderDTO();
        responseOrderDTO.setId(orderEntity.getId());
        responseOrderDTO.setPrice(orderEntity.getPrice());
        responseOrderDTO.setStatus(orderEntity.getStatus());
        responseOrderDTO.setOrderDate(orderEntity.getOrderDate());
        responseOrderDTO.setDeliveryDate(orderEntity.getDeliveryDate());
        return new ResponseOrderDTO();
    }

    public OrderEntity mapToOrderEntity(CreateOrderDTO createOrderDTO){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setPrice(createOrderDTO.getPrice());
        orderEntity.setStatus(createOrderDTO.getStatus());
        orderEntity.setOrderDate(createOrderDTO.getOrderDate());
        orderEntity.setDeliveryDate(createOrderDTO.getDeliveryDate());
        return orderEntity;
    }
}
