package com.examproject.ordermanager.model.query;

import com.examproject.ordermanager.model.login.Role;
import lombok.*;

import javax.persistence.Entity;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class checkUserOutput {

    private Boolean authentication;
    private String role;        // TODO
}
