package com.examproject.ordermanager.repository.data;

import com.examproject.ordermanager.model.data.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
