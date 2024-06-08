package com.xhak.demo.controllers;

import com.xhak.demo.dto.orderDtos.CreateOrderDTO;
import com.xhak.demo.dto.orderDtos.ResponseOrderDTO;
import com.xhak.demo.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/order")
public class OrderController {

    private OrderService orderService;

    @GetMapping("{id}")
    public ResponseEntity<ResponseOrderDTO> getOrderById(@PathVariable Long id) {
        Optional<ResponseOrderDTO> order = orderService.getOrderById(id);
        if (order.isPresent()) {
            return ResponseEntity.ok(order.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Long> createOrder(@RequestBody CreateOrderDTO order) {
        return ResponseEntity.ok(orderService.createOrder(order));
    }
    @PutMapping("{id}")
    public ResponseEntity<CreateOrderDTO> updateOrder(@PathVariable Long id, @RequestBody CreateOrderDTO order) {
        return ResponseEntity.ok(orderService.updateOrder(id, order));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.deleteOrder(id));
    }
}
