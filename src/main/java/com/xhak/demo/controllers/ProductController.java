package com.xhak.demo.controllers;

import com.xhak.demo.dto.productdtos.CreateProductDTO;
import com.xhak.demo.dto.productdtos.ResponseProductDTO;
import com.xhak.demo.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/product")
public class ProductController {
    private ProductService productService;

    @GetMapping("{id}")
    public ResponseEntity<ResponseProductDTO> getProductById(@PathVariable Long id) {
        Optional<ResponseProductDTO> product = productService.getProductById(id);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Long> createProduct(@RequestBody CreateProductDTO product) {
        return ResponseEntity.ok(productService.createProduct(product));
    }
    @PutMapping("{id}")
    public ResponseEntity<CreateProductDTO> updateProduct(@PathVariable Long id, @RequestBody CreateProductDTO product) {
        return ResponseEntity.ok(productService.updateProduct(id, product));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        return ResponseEntity.ok(productService.deleteProduct(id));
    }
}
