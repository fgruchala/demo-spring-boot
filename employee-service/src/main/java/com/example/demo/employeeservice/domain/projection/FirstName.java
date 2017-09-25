package com.example.demo.employeeservice.domain.projection;

import com.example.demo.employeeservice.domain.Employee;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "firstName", types = Employee.class)
public interface FirstName {

    String getFirstName();

}
