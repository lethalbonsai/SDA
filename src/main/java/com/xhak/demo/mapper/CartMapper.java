package com.xhak.demo.mapper;

import com.xhak.demo.dto.cartDtos.CreateCartDTO;
import com.xhak.demo.dto.cartDtos.ResponseCartDTO;
import com.xhak.demo.entities.CartEntity;
import org.springframework.stereotype.Component;

@Component
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

    public CreateCartDTO mapToCreateCartDTO(CartEntity updatedCart) {
        CreateCartDTO createCartDTO = new CreateCartDTO();
        return createCartDTO;
    }
}
