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
    private String agentCode;

    @Column(name = "agent_name")
    private String agentName;

    @Column(name = "working_area")
    private String workingArea;

    @Column(name = "commission")
    private Float commission;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "country")
    private String country;


}