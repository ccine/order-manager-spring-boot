package com.examproject.ordermanager.model.query;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class checkUserOutput {

    private Boolean authentication;
    private String role;        // TODO
}
