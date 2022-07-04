package com.examproject.ordermanager.model.mutation;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

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
