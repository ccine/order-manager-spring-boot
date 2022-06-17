package com.examproject.ordermanager.model.data;

import com.examproject.ordermanager.model.mutation.OrderInput;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

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
    private Float ord_amount;
    @Column(name = "advance_amount")
    private Float advance_amount;
    @Column(name = "ord_date")
    private Date ord_date;
    @ManyToOne
    @JoinColumn(name = "cust_code")
    private Customer custCode;
    @ManyToOne
    @JoinColumn(name = "agent_code")
    private Agent agentCode;
    @Column(name = "ord_description")
    private String ord_description;

}