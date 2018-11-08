package com.sai;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sai.dao.EmployeeDao;
import com.sai.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeDao employeeDao;

	@GetMapping("/saveEmployee")
	public void saveEmployee() {
		Employee employee = getEmployee();
		System.out.println(employeeDao.saveEmployee(employee));
	}

	@GetMapping("/getAll")
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
	
	@GetMapping("/getById/{idValue}")
	public Employee getEmployeeById(@PathVariable("idValue") Integer id) {
		Optional<Employee> employee = employeeDao.getEmployeeById(id);
		if(employee.isPresent()) {
			return employee.get();
		}
		return null;
	}

	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Sai");
		employee.setSalary(1000d);
		employee.setDoj(new Date());
		return employee;
	}
}
