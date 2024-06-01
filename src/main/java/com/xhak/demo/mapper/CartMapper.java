package com.xhak.demo.mapper;

import com.xhak.demo.dto.cartDtos.CreateCartDTO;
import com.xhak.demo.dto.cartDtos.ResponseCartDTO;
import com.xhak.demo.entities.CartEntity;

public class CartMapper {

    public ResponseCartDTO toResponseCartDTO(CartEntity cartEntity) {
        ResponseCartDTO responseCartDTO = new ResponseCartDTO();
        responseCartDTO.setId(cartEntity.getId());
        return responseCartDTO;
    }
    public CartEntity mapToCartEntity(CreateCartDTO createCartDTO) {
        CartEntity cartEntity = new CartEntity();
        return cartEntity;
    }
}
