package com.examproject.ordermanager.resolver;

import com.examproject.ordermanager.model.Agent;
import com.examproject.ordermanager.repository.AgentRepository;
import graphql.kickstart.tools.GraphQLResolver;

public class AgentResolver implements GraphQLResolver<Agent>{
    private AgentRepository agentRepository;

    public AgentResolver(AgentRepository agentRepository){
        this.agentRepository = agentRepository;
    }

    public Iterable<Agent> getAgents() {
        return agentRepository.findAll();
    }
}
