package com.examproject.ordermanager.repository.data;

import com.examproject.ordermanager.model.data.Agent;
import com.examproject.ordermanager.model.data.Customer;
import com.examproject.ordermanager.model.data.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findByAgentCode(Agent agent_code);
    List<Order> findByCustCode(Customer cust_code);
}
