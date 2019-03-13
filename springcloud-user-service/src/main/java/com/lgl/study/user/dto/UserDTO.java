package com.lgl.study.user.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
