package com.examproject.ordermanager.resolver;

import com.examproject.ordermanager.model.Agent;
import com.examproject.ordermanager.repository.AgentRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AgentResolver implements GraphQLQueryResolver {

    @Autowired
    private AgentRepository agentRepository;

    public AgentResolver(AgentRepository agentRepository){
        this.agentRepository = agentRepository;
    }

    public List<Agent> getAgents() {
        return agentRepository.findAll();
    }

    public Agent getAgent(String agent_code) {
        return agentRepository.findById(agent_code).get();
    }
}
