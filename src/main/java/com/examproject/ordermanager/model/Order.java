package com.examproject.ordermanager.model;

import javax.persistence.*;

@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    private String ord_num;
    @Column(name = "ord_amount")
    private Float ord_amount;
    @Column(name = "advance_amount")
    private Float advance_amount;
    @Column(name = "ord_date")
    private String ord_date;
    @ManyToOne
    @JoinColumn(name = "cust_code")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "agent_code")
    private Agent agent;
    @Column(name = "ord_description")
    private String ord_description;

    public Order(String ord_num, Float ord_amount, Float advance_amount, String ord_date, Customer customer, Agent agent, String ord_description) {
        this.ord_num = ord_num;
        this.ord_amount = ord_amount;
        this.advance_amount = advance_amount;
        this.ord_date = ord_date;
        this.customer = customer;
        this.agent = agent;
        this.ord_description = ord_description;
    }

    public String getOrd_num() {
        return ord_num;
    }

    public void setOrd_num(String ord_num) {
        this.ord_num = ord_num;
    }

    public Float getOrd_amount() {
        return ord_amount;
    }

    public void setOrd_amount(Float ord_amount) {
        this.ord_amount = ord_amount;
    }

    public Float getAdvance_amount() {
        return advance_amount;
    }

    public void setAdvance_amount(Float advance_amount) {
        this.advance_amount = advance_amount;
    }

    public String getOrd_date() {
        return ord_date;
    }

    public void setOrd_date(String ord_date) {
        this.ord_date = ord_date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getOrd_description() {
        return ord_description;
    }

    public void setOrd_description(String ord_description) {
        this.ord_description = ord_description;
    }
}