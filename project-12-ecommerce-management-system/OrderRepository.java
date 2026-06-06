package com.alhanoof.ecommerce.repository;

import com.alhanoof.ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByCustomerNameContainingIgnoreCase(String customerName);

    List<Order> findByOrderStatusIgnoreCase(String orderStatus);

    List<Order> findByPaymentStatusIgnoreCase(String paymentStatus);
}
