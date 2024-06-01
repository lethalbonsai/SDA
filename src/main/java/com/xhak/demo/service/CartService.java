package com.xhak.demo.service;

import com.xhak.demo.dto.cartDtos.CreateCartDTO;
import com.xhak.demo.dto.cartDtos.ResponseCartDTO;
import java.util.List;
import java.util.Optional;

public interface CartService {
    List<ResponseCartDTO> getAllCarts();
    Optional<ResponseCartDTO> getCartById(Long id);
    Long createCart(CreateCartDTO createCartDTO);
    CreateCartDTO updateCart(Long id, CreateCartDTO createCartDTO);
    String deleteCart(Long id);
}
