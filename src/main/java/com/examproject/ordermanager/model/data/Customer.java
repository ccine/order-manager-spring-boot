package com.examproject.ordermanager.model.data;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    @Id
    @Column(name = "cust_code")
    private String custCode;
    @Column(name = "cust_name")
    private String custName;
    @Column(name = "cust_city")
    private String custCity;
    @Column(name = "working_area")
    private String workingArea;
    @Column(name = "cust_country")
    private String custCountry;
    @Column(name = "grade")
    private int grade;
    @Column(name = "opening_amt")
    private Float openingAmt;
    @Column(name = "receive_amt")
    private Float receiveAmt;
    @Column(name = "payment_amt")
    private Float paymentAmt;
    @Column(name = "outstanding_amt")
    private Float outstandingAmt;
    @Column(name = "phone_no")
    private String phoneNo;
    @ManyToOne
    @JoinColumn(name = "AGENT_CODE")
    private Agent agentCode;

}