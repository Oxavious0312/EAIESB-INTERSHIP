package com.eaiesb.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService service;
	
	@PostMapping("/employee")
	public Employee createEmployee(@Validated @RequestBody Employee emp) {
		return service.create(emp);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){          // to get records of all employees
		return service.getAll();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable String id){          // to get records of single employee
		return service.getById(id);
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@PathVariable String id, @Validated @RequestBody Employee emp) {    // to update the details of the employee
		return service.update(id,emp);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable String id) {                         // to delete and employee value by id
		service.delete(id);
		return "Employee with id : " + id + " deleted Successfully";
	}
	
	
}
