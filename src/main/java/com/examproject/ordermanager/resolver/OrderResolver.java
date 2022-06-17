package com.examproject.ordermanager.resolver;

import com.examproject.ordermanager.model.data.Agent;
import com.examproject.ordermanager.model.data.Customer;
import com.examproject.ordermanager.model.data.Order;
import com.examproject.ordermanager.model.mutation.OrderInput;
import com.examproject.ordermanager.repository.data.AgentRepository;
import com.examproject.ordermanager.repository.data.CustomerRepository;
import com.examproject.ordermanager.repository.data.OrderRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AgentRepository agentRepository;

    public OrderResolver(OrderRepository orderRepository, CustomerRepository customerRepository, AgentRepository agentRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.agentRepository = agentRepository;
    }

    public List<Order> getAgentOrders(String agentCode){
        Optional<Agent> agent = agentRepository.findById(agentCode);
        if(agent.isPresent())
            return orderRepository.findByAgentCode(agent.get());
        return null;
    }

    public List<Order> getCustomerOrders(String custCode){
        Optional<Customer> customer = customerRepository.findById(custCode);
        if(customer.isPresent())
            return orderRepository.findByCustCode(customer.get());
        return null;
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order updateOrder(int ordNum, OrderInput order){
        Optional<Order> oldOrder = orderRepository.findById(ordNum);
        Optional<Agent> agent = agentRepository.findById(order.getAgentCode());
        Optional<Customer> customer = customerRepository.findById(order.getCustCode());

        if(oldOrder.isPresent() && agent.isPresent() && customer.isPresent()){
            Order modifiedOrder = new Order(ordNum, order.getOrdAmount(), order.getAdvanceAmount(), order.getOrdDate(), customer.get(), agent.get(), order.getOrdDescription());
            orderRepository.save(modifiedOrder);
            return modifiedOrder;
        }
        return null;
    }

}
