package com.sai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
