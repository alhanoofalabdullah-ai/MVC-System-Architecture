package com.alhanoof.inventory.service;

import com.alhanoof.inventory.dto.ProductRequest;
import com.alhanoof.inventory.dto.ProductResponse;
import com.alhanoof.inventory.entity.Product;
import com.alhanoof.inventory.exception.ResourceNotFoundException;
import com.alhanoof.inventory.exception.ValidationException;
import com.alhanoof.inventory.mapper.ProductMapper;
import com.alhanoof.inventory.repository.ProductRepository;
import com.alhanoof.inventory.validation.ProductValidator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductResponse createProduct(ProductRequest request) {
        ProductValidator.validateStatus(request);
        ProductValidator.validateInventoryRules(request);

        repository.findBySku(request.getSku().toUpperCase()).ifPresent(product -> {
            throw new ValidationException("Product SKU already exists");
        });

        Product product = ProductMapper.toEntity(request);
        Product savedProduct = repository.save(product);

        return ProductMapper.toResponse(savedProduct);
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return repository.findAll()
                .stream()
                .map(ProductMapper::toResponse)
                .toList();
    }

    @Override
    public ProductResponse getProductById(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));

        return ProductMapper.toResponse(product);
    }

    @Override
    public ProductResponse updateProduct(Long id, ProductRequest request) {
        ProductValidator.validateStatus(request);
        ProductValidator.validateInventoryRules(request);

        Product product = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));

        repository.findBySku(request.getSku().toUpperCase()).ifPresent(existingProduct -> {
            if (!existingProduct.getId().equals(id)) {
                throw new ValidationException("Product SKU already exists");
            }
        });

        ProductMapper.updateEntity(product, request);
        Product updatedProduct = repository.save(product);

        return ProductMapper.toResponse(updatedProduct);
    }

    @Override
    public String deleteProduct(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));

        repository.delete(product);

        return "Product deleted successfully";
    }

    @Override
    public List<ProductResponse> searchByCategory(String category) {
        return repository.findByCategoryIgnoreCase(category)
                .stream()
                .map(ProductMapper::toResponse)
                .toList();
    }

    @Override
    public List<ProductResponse> searchByStatus(String status) {
        return repository.findByStatusIgnoreCase(status)
                .stream()
                .map(ProductMapper::toResponse)
                .toList();
    }

    @Override
    public Page<ProductResponse> getProductsWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());

        return repository.findAll(pageable)
                .map(ProductMapper::toResponse);
    }
}
