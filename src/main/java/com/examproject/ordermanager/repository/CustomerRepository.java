package com.examproject.ordermanager.repository;

import com.examproject.ordermanager.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
