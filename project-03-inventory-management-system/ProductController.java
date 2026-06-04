package com.alhanoof.inventory.controller;

import com.alhanoof.inventory.dto.ProductRequest;
import com.alhanoof.inventory.dto.ProductResponse;
import com.alhanoof.inventory.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public ProductResponse createProduct(@Valid @RequestBody ProductRequest request) {
        return service.createProduct(request);
    }

    @GetMapping
    public List<ProductResponse> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductResponse getProductById(@PathVariable Long id) {
        return service.getProductById(id);
    }

    @PutMapping("/{id}")
    public ProductResponse updateProduct(
            @PathVariable Long id,
            @Valid @RequestBody ProductRequest request
    ) {
        return service.updateProduct(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        return service.deleteProduct(id);
    }

    @GetMapping("/search/category")
    public List<ProductResponse> searchByCategory(@RequestParam String category) {
        return service.searchByCategory(category);
    }

    @GetMapping("/search/status")
    public List<ProductResponse> searchByStatus(@RequestParam String status) {
        return service.searchByStatus(status);
    }

    @GetMapping("/paged")
    public Page<ProductResponse> getProductsWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return service.getProductsWithPagination(page, size, sortBy);
    }
}
