package com.examproject.ordermanager.model;

import javax.persistence.*;

@Entity
@Table(name = "AGENT")
public class Agent {
    @Id
    private String agent_code;
    @Column(name = "agent_name")
    private String agent_name;
    @Column(name = "working_area")
    private String working_area;
    @Column(name = "commission")
    private Float commission;
    @Column(name = "phone_no")
    private String phone_no;
    @Column(name = "country")
    private String country;

    public Agent(String agent_code, String agent_name, String working_area, Float commission, String phone_no, String country) {
        this.agent_code = agent_code;
        this.agent_name = agent_name;
        this.working_area = working_area;
        this.commission = commission;
        this.phone_no = phone_no;
        this.country = country;
    }

    public String getAgent_code() {
        return agent_code;
    }

    public void setAgent_code(String agent_code) {
        this.agent_code = agent_code;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public String getWorking_area() {
        return working_area;
    }

    public void setWorking_area(String working_area) {
        this.working_area = working_area;
    }

    public Float getCommission() {
        return commission;
    }

    public void setCommission(Float commission) {
        this.commission = commission;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}