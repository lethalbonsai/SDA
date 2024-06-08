package com.xhak.demo.controllers;

import com.xhak.demo.dto.orderItemDtos.CreateOrderItemDTO;
import com.xhak.demo.dto.orderItemDtos.ResponseOrderItemDTO;
import com.xhak.demo.service.OrderItemService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/orderItem")
public class OrderItemController {
    private OrderItemService orderItemService;

    @GetMapping("{id}")
    public ResponseEntity<ResponseOrderItemDTO> getOrderItemById(@PathVariable Long id) {
        Optional<ResponseOrderItemDTO> orderItem = orderItemService.getOrderItemById(id);
        if (orderItem.isPresent()) {
            return ResponseEntity.ok(orderItem.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Long> createOrderItem(@RequestBody CreateOrderItemDTO orderItem) {
        return ResponseEntity.ok(orderItemService.createOrderItem(orderItem));
    }
    @PutMapping("{id}")
    public ResponseEntity<CreateOrderItemDTO> updateOrderItem(@PathVariable Long id, @RequestBody CreateOrderItemDTO orderItem) {
        return ResponseEntity.ok(orderItemService.updateOrderItem(id, orderItem));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteOrderItem(@PathVariable Long id) {
        return ResponseEntity.ok(orderItemService.deleteOrderItem(id));
    }
}
