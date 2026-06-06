package com.alhanoof.ecommerce.controller;

import com.alhanoof.ecommerce.dto.OrderRequest;
import com.alhanoof.ecommerce.dto.OrderResponse;
import com.alhanoof.ecommerce.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public OrderResponse createOrder(@Valid @RequestBody OrderRequest request) {
        return service.createOrder(request);
    }

    @GetMapping
    public List<OrderResponse> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public OrderResponse getOrderById(@PathVariable Long id) {
        return service.getOrderById(id);
    }

    @PutMapping("/{id}")
    public OrderResponse updateOrder(@PathVariable Long id, @Valid @RequestBody OrderRequest request) {
        return service.updateOrder(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {
        return service.deleteOrder(id);
    }

    @GetMapping("/search/customer")
    public List<OrderResponse> searchByCustomerName(@RequestParam String customerName) {
        return service.searchByCustomerName(customerName);
    }

    @GetMapping("/search/status")
    public List<OrderResponse> searchByOrderStatus(@RequestParam String orderStatus) {
        return service.searchByOrderStatus(orderStatus);
    }

    @GetMapping("/paged")
    public Page<OrderResponse> getOrdersWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return service.getOrdersWithPagination(page, size, sortBy);
    }
}
