package com.alhanoof.inventory.service;

import com.alhanoof.inventory.dto.ProductRequest;
import com.alhanoof.inventory.dto.ProductResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    ProductResponse createProduct(ProductRequest request);

    List<ProductResponse> getAllProducts();

    ProductResponse getProductById(Long id);

    ProductResponse updateProduct(Long id, ProductRequest request);

    String deleteProduct(Long id);

    List<ProductResponse> searchByCategory(String category);

    List<ProductResponse> searchByStatus(String status);

    Page<ProductResponse> getProductsWithPagination(int page, int size, String sortBy);
}
