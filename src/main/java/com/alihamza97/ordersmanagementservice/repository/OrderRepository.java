package com.alihamza97.ordersmanagementservice.repository;

import com.alihamza97.ordersmanagementservice.model.Order;
import com.alihamza97.ordersmanagementservice.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomerEmail(String customerEmail);

    List<Order> findByStatus(OrderStatus status);
}
