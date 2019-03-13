package com.lgl.study.user.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class UserDTO {

    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;

}
