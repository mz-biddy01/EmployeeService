package com.example.codeclan.EmployeeService;

import com.example.codeclan.EmployeeService.models.Employee;
import com.example.codeclan.EmployeeService.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee helen = new Employee("Helen Aguda", 80, "goGetter@gmail.com");
		employeeRepository.save(helen);
		Employee Ada = new Employee("Ada Peter", 40, "adasweetie@gmail.com");
		employeeRepository.save(Ada);
	}

}
