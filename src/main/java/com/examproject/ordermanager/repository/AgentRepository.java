package com.examproject.ordermanager.repository;

import com.examproject.ordermanager.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository <Agent, String> {
}
