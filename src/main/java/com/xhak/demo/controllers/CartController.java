package com.xhak.demo.controllers;

import com.xhak.demo.dto.cartDtos.CreateCartDTO;
import com.xhak.demo.dto.cartDtos.ResponseCartDTO;
import com.xhak.demo.service.CartService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/cart")
public class CartController {
    private CartService cartService;


    @GetMapping("{id}")
    public ResponseEntity<ResponseCartDTO> getCartById(@PathVariable Long id) {
        Optional<ResponseCartDTO> cart = cartService.getCartById(id);
        if (cart.isPresent()) {
            return ResponseEntity.ok(cart.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Long> createCart(@RequestBody CreateCartDTO cart) {
        return ResponseEntity.ok(cartService.createCart(cart));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CreateCartDTO> updateCart(@PathVariable Long id, @RequestBody CreateCartDTO cart) {
        return ResponseEntity.ok(cartService.updateCart(id, cart));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCart(@PathVariable Long id) {
        return ResponseEntity.ok(cartService.deleteCart(id));
    }
}
