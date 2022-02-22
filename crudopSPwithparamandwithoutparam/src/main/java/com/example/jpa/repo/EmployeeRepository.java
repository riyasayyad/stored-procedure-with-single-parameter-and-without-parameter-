package com.example.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entites.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
