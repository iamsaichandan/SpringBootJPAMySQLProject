package com.sai.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.entity.Employee;
import com.sai.repository.EmployeeRepository;

@Service
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> getEmployeeById(Integer id) {
		return employeeRepository.findById(id);
	}
}
