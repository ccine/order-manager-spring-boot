package com.examproject.ordermanager.model.data;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "agents")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "agent_code")
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


}