package com.alhanoof.ecommerce.service;

import com.alhanoof.ecommerce.dto.OrderRequest;
import com.alhanoof.ecommerce.dto.OrderResponse;
import com.alhanoof.ecommerce.entity.Order;
import com.alhanoof.ecommerce.exception.ResourceNotFoundException;
import com.alhanoof.ecommerce.mapper.OrderMapper;
import com.alhanoof.ecommerce.repository.OrderRepository;
import com.alhanoof.ecommerce.validation.OrderValidator;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    public OrderResponse createOrder(OrderRequest request) {
        OrderValidator.validatePaymentStatus(request);
        OrderValidator.validateOrderStatus(request);

        Order order = OrderMapper.toEntity(request);
        return OrderMapper.toResponse(repository.save(order));
    }

    public List<OrderResponse> getAllOrders() {
        return repository.findAll().stream().map(OrderMapper::toResponse).toList();
    }

    public OrderResponse getOrderById(Long id) {
        Order order = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));

        return OrderMapper.toResponse(order);
    }

    public OrderResponse updateOrder(Long id, OrderRequest request) {
        OrderValidator.validatePaymentStatus(request);
        OrderValidator.validateOrderStatus(request);

        Order order = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));

        OrderMapper.updateEntity(order, request);
        return OrderMapper.toResponse(repository.save(order));
    }

    public String deleteOrder(Long id) {
        Order order = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));

        repository.delete(order);
        return "Order deleted successfully";
    }

    public List<OrderResponse> searchByCustomerName(String customerName) {
        return repository.findByCustomerNameContainingIgnoreCase(customerName)
                .stream().map(OrderMapper::toResponse).toList();
    }

    public List<OrderResponse> searchByOrderStatus(String orderStatus) {
        return repository.findByOrderStatusIgnoreCase(orderStatus)
                .stream().map(OrderMapper::toResponse).toList();
    }

    public Page<OrderResponse> getOrdersWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());
        return repository.findAll(pageable).map(OrderMapper::toResponse);
    }
}
