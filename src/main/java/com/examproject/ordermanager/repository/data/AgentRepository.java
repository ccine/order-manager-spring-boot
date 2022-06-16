package com.examproject.ordermanager.repository.data;

import com.examproject.ordermanager.model.data.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository <Agent, String> {
}
