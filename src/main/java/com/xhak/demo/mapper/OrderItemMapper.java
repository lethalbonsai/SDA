package com.xhak.demo.mapper;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.orderItemDtos.CreateOrderItemDTO;
import com.xhak.demo.dto.orderItemDtos.ResponseOrderItemDTO;
import com.xhak.demo.entities.AddressEntity;
import com.xhak.demo.entities.OrderItemEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderItemMapper {
    public ResponseOrderItemDTO toResponseOrderItemDTO(OrderItemEntity orderItemEntity) {
        ResponseOrderItemDTO responseOrderItemDTO = new ResponseOrderItemDTO();
        responseOrderItemDTO.setId(orderItemEntity.getId());
        responseOrderItemDTO.setQuantity(orderItemEntity.getQuantity());
        responseOrderItemDTO.setTotalPrice(orderItemEntity.getTotalPrice());
        return new ResponseOrderItemDTO();
    }

    public OrderItemEntity toMapToOrderItemEntity(CreateOrderItemDTO createOrderItemDTO) {
        OrderItemEntity orderItemEntity = new OrderItemEntity();
        orderItemEntity.setQuantity(createOrderItemDTO.getQuantity());
        orderItemEntity.setTotalPrice(createOrderItemDTO.getTotalPrice());
        return orderItemEntity;
    }

//    public CreateOrderItemDTO mapToCreateOrderItemEntity(OrderItemEntity orderItemEntity) {
//        CreateOrderItemDTO createOrderItemDTO = new CreateOrderItemDTO();
//        createAddressDTO.setState(addressEntity.getState());
//        createAddressDTO.setCity(addressEntity.getCity());
//        createAddressDTO.setStreet(addressEntity.getStreet());
//        createAddressDTO.setZipCode(addressEntity.getZipCode());
//        return createAddressDTO;
//    }
}
