package com.eaiesb.students;

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
public class VitstudentsController {
	
	@Autowired
	public VitstudentsService service;
	
	@PostMapping("/student")
	public Vitstudents createLocation(@Validated @RequestBody Vitstudents vitstu) {
		return service.create(vitstu);
	}
	
	@GetMapping("/student")
	public List<Vitstudents> getAllLocation(){          
		return service.getAll();
	}
	
	@GetMapping("/student/{id}")
	public Optional<Vitstudents> getLocationById(@PathVariable String id){          // to get records of single employee
		return service.getById(id);
	}
	
	@PutMapping("/student/{id}")
	public Vitstudents updateLocation(@PathVariable String id, @Validated @RequestBody Vitstudents vitstu) {    // to update the details of the employee
		return service.update(id,vitstu);
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteLocation(@PathVariable String id) {                         // to delete and employee value by id
		service.delete(id);
		return "Vit student with id : " + id + " deleted Successfully";
	}
	
	@GetMapping("/students/{depid}")
	public List<Vitstudents> getstudId(@PathVariable String depid){
		return service.getBydepid(depid);
	}
	
	
}
