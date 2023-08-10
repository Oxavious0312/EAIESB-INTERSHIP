package com.eaiesb.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository empRepo;
	
	public Employee create(Employee emp) {
		return empRepo.save(emp);
	}
	
	public List<Employee> getAll(){            // to get the list of all employees
		return empRepo.findAll();
	}
	
	public Optional<Employee> getById(String id){    // to get the details of a single employee
		return empRepo.findById(id);
	}
	
	public Employee update(String id,Employee emp) {   // to update the employee details
		emp.setId(id);
		return empRepo.save(emp);
	}
	
	public String delete(String id) {                       // to delete and employee value by id
		empRepo.deleteById(id);
		return "Employee with id : " + id + " deleted Successfully";
	}
	
	
}