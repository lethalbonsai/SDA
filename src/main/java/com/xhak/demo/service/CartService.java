package com.xhak.demo.service;

import com.xhak.demo.dto.cartDtos.CreateCartDTO;
import java.util.List;
import java.util.Optional;

public interface CartService {
    List<CreateCartDTO> getAllCarts();
    Optional<CreateCartDTO> getCartById(Long id);
    Long createCart(CreateCartDTO createCartDTO);
    CreateCartDTO updateCart(Long id, CreateCartDTO createCartDTO);
    String deleteCart(Long id);
}
