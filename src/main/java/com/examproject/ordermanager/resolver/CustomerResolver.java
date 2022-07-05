package com.examproject.ordermanager.resolver;

import com.examproject.ordermanager.model.data.Agent;
import com.examproject.ordermanager.model.data.Customer;
import com.examproject.ordermanager.repository.data.AgentRepository;
import com.examproject.ordermanager.repository.data.CustomerRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class CustomerResolver implements GraphQLQueryResolver {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AgentRepository agentRepository;

    public CustomerResolver(CustomerRepository customerRepository, AgentRepository agentRepository){
        this.customerRepository = customerRepository;
        this.agentRepository = agentRepository;
    }

    // get all customers managed by the agent
    public List<Customer> getCustomersByAgent(String agentCode){
        Optional<Agent> agent = agentRepository.findById(agentCode);
        if(agent.isPresent())
            return customerRepository.findByAgentCode(agent.get());
        return null;
    }

    // get all customers
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
}
