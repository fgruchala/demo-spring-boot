package com.example.demo.employeeservice.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id") @ToString
public class Employee {

    @Id @GeneratedValue
    private Long id;

    private String firstName;

    private String name;

}
