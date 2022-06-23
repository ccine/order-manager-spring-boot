package com.examproject.ordermanager.model.mutation;

import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderInput {
    private Float ordAmount;
    private Float advanceAmount;
    private LocalDate ordDate;
    private String custCode;
    private String agentCode;
    private String ordDescription;
}
