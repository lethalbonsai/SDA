package com.xhak.demo.mapper;

import com.xhak.demo.dto.orderItemDtos.ResponseOrderItemDTO;
import com.xhak.demo.entities.OrderItemEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderItemMapper {
    public ResponseOrderItemDTO responseOrderItemDTO(OrderItemEntity orderItemEntity) {
        ResponseOrderItemDTO responseOrderItemDTO = new ResponseOrderItemDTO();
        responseOrderItemDTO.setId(orderItemEntity.getId());
        responseOrderItemDTO.setQuantity(orderItemEntity.getQuantity());
        responseOrderItemDTO.setTotalPrice(orderItemEntity.getTotalPrice());
        return new ResponseOrderItemDTO();
    }

    public OrderItemEntity mapToOrderItemEntity(ResponseOrderItemDTO responseOrderItemDTO) {
        OrderItemEntity orderItemEntity = new OrderItemEntity();
        orderItemEntity.setQuantity(responseOrderItemDTO.getQuantity());
        orderItemEntity.setTotalPrice(responseOrderItemDTO.getTotalPrice());
        return orderItemEntity;
    }
}
