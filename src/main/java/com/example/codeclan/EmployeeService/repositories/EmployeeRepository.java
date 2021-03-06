package com.example.codeclan.EmployeeService.repositories;

import com.example.codeclan.EmployeeService.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
