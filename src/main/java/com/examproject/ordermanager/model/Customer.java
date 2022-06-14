package com.examproject.ordermanager.model;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    private String cust_code;
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
    @JoinColumn(name = "agent_code")
    private Agent agent;

    public Customer(String cust_code, String cust_name, String cust_city, String working_area, String cust_country, int grade, Float opening_amt, Float receive_amt, Float payment_amt, Float outstanding_amt, String phone_no, Agent agent) {
        this.cust_code = cust_code;
        this.cust_name = cust_name;
        this.cust_city = cust_city;
        this.working_area = working_area;
        this.cust_country = cust_country;
        this.grade = grade;
        this.opening_amt = opening_amt;
        this.receive_amt = receive_amt;
        this.payment_amt = payment_amt;
        this.outstanding_amt = outstanding_amt;
        this.phone_no = phone_no;
        this.agent = agent;
    }

    public String getCust_code() {
        return cust_code;
    }

    public void setCust_code(String cust_code) {
        this.cust_code = cust_code;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_city() {
        return cust_city;
    }

    public void setCust_city(String cust_city) {
        this.cust_city = cust_city;
    }

    public String getWorking_area() {
        return working_area;
    }

    public void setWorking_area(String working_area) {
        this.working_area = working_area;
    }

    public String getCust_country() {
        return cust_country;
    }

    public void setCust_country(String cust_country) {
        this.cust_country = cust_country;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Float getOpening_amt() {
        return opening_amt;
    }

    public void setOpening_amt(Float opening_amt) {
        this.opening_amt = opening_amt;
    }

    public Float getReceive_amt() {
        return receive_amt;
    }

    public void setReceive_amt(Float receive_amt) {
        this.receive_amt = receive_amt;
    }

    public Float getPayment_amt() {
        return payment_amt;
    }

    public void setPayment_amt(Float payment_amt) {
        this.payment_amt = payment_amt;
    }

    public Float getOutstanding_amt() {
        return outstanding_amt;
    }

    public void setOutstanding_amt(Float outstanding_amt) {
        this.outstanding_amt = outstanding_amt;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
}