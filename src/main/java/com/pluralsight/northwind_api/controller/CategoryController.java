package com.pluralsight.northwind_api.controller;

import com.pluralsight.northwind_api.model.Category;
import com.pluralsight.northwind_api.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable int categoryId) {
        return ResponseEntity.ok(categoryService.getCategoryById(categoryId))

    }


}
