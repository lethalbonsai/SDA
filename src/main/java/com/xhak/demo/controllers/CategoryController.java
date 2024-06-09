package com.xhak.demo.controllers;

import com.xhak.demo.dto.categoryDtos.CreateCategoryDTO;
import com.xhak.demo.dto.categoryDtos.ResponseCategoryDTO;
import com.xhak.demo.service.CategoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private CategoryService categoryService;

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("{id}")
    public ResponseEntity<ResponseCategoryDTO> getCategoryById(@PathVariable Long id) {
        Optional<ResponseCategoryDTO> category = categoryService.getCategoryById(id);
        if (category.isPresent()) {
            return ResponseEntity.ok(category.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }
    @PreAuthorize("hasRole('ROLE_USER')")
    @PostMapping
    public ResponseEntity<Long> createCategory(@RequestBody CreateCategoryDTO category) {
        return ResponseEntity.ok(categoryService.createCategory(category));
    }
    @PutMapping("{id}")
    public ResponseEntity<CreateCategoryDTO> updateCategory(@PathVariable Long id, @RequestBody CreateCategoryDTO category) {
        return ResponseEntity.ok(categoryService.updateCategory(id, category));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.deleteCategory(id));
    }
}
