package com.example.demo.employeeservice;

import com.example.demo.employeeservice.domain.Employee;
import com.example.demo.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Bean
	public CommandLineRunner initData() {
		return args -> {
			Employee employee1 = new Employee();
			employee1.setFirstName("James");
			employee1.setName("BOND");

			Employee employee2 = new Employee();
			employee2.setFirstName("Doctor");
			employee2.setName("NO");

			employeeRepository.save(employee1);
			employeeRepository.save(employee2);
		};
	}
}
