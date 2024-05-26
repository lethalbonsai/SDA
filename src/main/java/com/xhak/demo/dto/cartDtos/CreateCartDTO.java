package com.xhak.demo.dto.cartDtos;


import com.xhak.demo.dto.orderItemDtos.CreateOrderItemDTO;
import com.xhak.demo.dto.userDtos.CreateUserDTO;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateCartDTO {
    private CreateUserDTO user;
    private List<CreateOrderItemDTO> orderItems;
}
