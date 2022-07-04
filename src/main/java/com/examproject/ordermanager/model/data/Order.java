package com.examproject.ordermanager.model.data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {
    @Id
    @Column(name = "ord_num")
    private int ordNum;
    @Column(name = "ord_amount")
    private Float ordAmount;
    @Column(name = "advance_amount")
    private Float advanceAmount;
    @Column(name = "ord_date")
    private LocalDate ordDate;
    @ManyToOne
    @JoinColumn(name = "cust_code")
    private Customer custCode;
    @ManyToOne
    @JoinColumn(name = "agent_code")
    private Agent agentCode;
    @Column(name = "ord_description")
    private String ordDescription;

}