package com.alhanoof.inventory.mapper;

import com.alhanoof.inventory.dto.ProductRequest;
import com.alhanoof.inventory.dto.ProductResponse;
import com.alhanoof.inventory.entity.Product;

import java.time.LocalDate;

public class ProductMapper {

    private ProductMapper() {
    }

    public static Product toEntity(ProductRequest request) {
        Double inventoryValue = request.getQuantity() * request.getUnitPrice();

        return new Product(
                request.getProductName(),
                request.getSku().toUpperCase(),
                request.getCategory().toUpperCase(),
                request.getSupplierName(),
                request.getQuantity(),
                request.getUnitPrice(),
                inventoryValue,
                LocalDate.now(),
                request.getStatus().toUpperCase()
        );
    }

    public static ProductResponse toResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getProductName(),
                product.getSku(),
                product.getCategory(),
                product.getSupplierName(),
                product.getQuantity(),
                product.getUnitPrice(),
                product.getInventoryValue(),
                product.getCreatedDate(),
                product.getStatus()
        );
    }

    public static void updateEntity(Product product, ProductRequest request) {
        Double inventoryValue = request.getQuantity() * request.getUnitPrice();

        product.setProductName(request.getProductName());
        product.setSku(request.getSku().toUpperCase());
        product.setCategory(request.getCategory().toUpperCase());
        product.setSupplierName(request.getSupplierName());
        product.setQuantity(request.getQuantity());
        product.setUnitPrice(request.getUnitPrice());
        product.setInventoryValue(inventoryValue);
        product.setStatus(request.getStatus().toUpperCase());
    }
}
