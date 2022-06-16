package com.examproject.ordermanager.repository.data;

import com.examproject.ordermanager.model.data.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
