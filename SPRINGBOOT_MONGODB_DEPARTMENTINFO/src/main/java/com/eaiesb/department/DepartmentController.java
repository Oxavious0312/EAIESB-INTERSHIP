package com.eaiesb.department;

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
public class DepartmentController {

	@Autowired
	public DepartmentService service;
	
	@PostMapping("/deparment")
	public Department createLocation(@Validated @RequestBody Department dep) {
		return service.create(dep);
	}
	
	@GetMapping("/department")
	public List<Department> getAllLocation(){          
		return service.getAll();
	}
	
	@GetMapping("/department/{id}")
	public Optional<Department> getLocationById(@PathVariable String id){          // to get records of single employee
		return service.getById(id);
	}
	
	@PutMapping("/department/{id}")
	public Department updateLocation(@PathVariable String id, @Validated @RequestBody Department dep) {    // to update the details of the employee
		return service.update(id,dep);
	}
	
	@DeleteMapping("/department/{id}")
	public String deleteDepartment(@PathVariable String id) {                         // to delete and employee value by id
		service.delete(id);
		return "Department with id : " + id + " deleted Successfully";
	}
}
