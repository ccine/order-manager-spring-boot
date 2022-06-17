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
    private String cust_name;
    @Column(name = "cust_city")
    private String cust_city;
    @Column(name = "working_area")
    private String working_area;
    @Column(name = "cust_country")
    private String cust_country;
    @Column(name = "grade")
    private int grade;
    @Column(name = "opening_amt")
    private Float opening_amt;
    @Column(name = "receive_amt")
    private Float receive_amt;
    @Column(name = "payment_amt")
    private Float payment_amt;
    @Column(name = "outstanding_amt")
    private Float outstanding_amt;
    @Column(name = "phone_no")
    private String phone_no;
    @ManyToOne
    @JoinColumn(name = "AGENT_CODE")
    private Agent agentCode;

}