package com.examproject.ordermanager.repository;

import com.examproject.ordermanager.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
