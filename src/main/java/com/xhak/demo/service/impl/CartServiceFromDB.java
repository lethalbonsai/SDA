package com.xhak.demo.service.impl;

import com.xhak.demo.dto.cartDtos.CreateCartDTO;
import com.xhak.demo.dto.cartDtos.ResponseCartDTO;
import com.xhak.demo.entities.AddressEntity;
import com.xhak.demo.entities.CartEntity;
import com.xhak.demo.mapper.CartMapper;
import com.xhak.demo.repository.CartRepository;
import com.xhak.demo.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CartServiceFromDB implements CartService {

    private CartRepository cartRepository;
    private CartMapper cartMapper;
    @Override
    public List<ResponseCartDTO> getAllCarts() {
        List<CartEntity> cartList = cartRepository.findAll();
        List<ResponseCartDTO> responseCartDTOList = new ArrayList<>();
        for (CartEntity cartEntity : cartList) {
            responseCartDTOList.add(cartMapper.toResponseCartDTO(cartEntity));
        }
        return responseCartDTOList;
    }

    @Override
    public Optional<ResponseCartDTO> getCartById(Long id) {
        CartEntity foundCart = cartRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Cart with id: " + id + " was not found!"));
        return Optional.of(cartMapper.toResponseCartDTO(foundCart));
    }

    @Override
    public Long createCart(CreateCartDTO createCartDTO) {
        CartEntity createCartEntity = cartMapper.mapToCartEntity(createCartDTO);
        CartEntity savedCart = cartRepository.save(createCartEntity);
        return savedCart.getId();
    }

    @Override
    public CreateCartDTO updateCart(Long id, CreateCartDTO createCartDTO) {
        CartEntity findCart = cartRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Cart with id: " + id + " was not found!"));
        cartMapper.mapToCartEntity(createCartDTO);
        CartEntity updatedCart = cartRepository.save(findCart);
        return cartMapper.mapToCreateCartDTO(updatedCart);
    }

    @Override
    public String deleteCart(Long id) {
        CartEntity cartEntity = cartRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Cart with id: " + id + " was not found!"));
        cartRepository.delete(cartEntity);
        return "Cart with id: " + id + " was successfully deleted!";
    }
}
