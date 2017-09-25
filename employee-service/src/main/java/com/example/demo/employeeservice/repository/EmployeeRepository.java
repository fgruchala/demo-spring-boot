package com.example.demo.employeeservice.repository;

import com.example.demo.employeeservice.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    List<Employee> findAllByFirstName(@Param("firstname") String firstname);

}
