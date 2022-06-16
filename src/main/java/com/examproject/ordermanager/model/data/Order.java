package com.examproject.ordermanager.model.data;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
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
}