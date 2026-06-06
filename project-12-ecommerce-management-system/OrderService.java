package com.alhanoof.ecommerce.service;

import com.alhanoof.ecommerce.dto.OrderRequest;
import com.alhanoof.ecommerce.dto.OrderResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    List<OrderResponse> getAllOrders();

    OrderResponse getOrderById(Long id);

    OrderResponse updateOrder(Long id, OrderRequest request);

    String deleteOrder(Long id);

    List<OrderResponse> searchByCustomerName(String customerName);

    List<OrderResponse> searchByOrderStatus(String orderStatus);

    Page<OrderResponse> getOrdersWithPagination(int page, int size, String sortBy);
}
