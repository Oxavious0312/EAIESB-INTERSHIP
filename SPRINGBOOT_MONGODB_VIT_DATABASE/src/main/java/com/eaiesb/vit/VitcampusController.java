package com.eaiesb.vit;

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
public class VitcampusController {
	
	@Autowired
	public VitcampusService service;
	
	@PostMapping("/campus")
	public Vitcampus createLocation(@Validated @RequestBody Vitcampus vitcamp) {
		return service.create(vitcamp);
	}
	
	@GetMapping("/campus")
	public List<Vitcampus> getAllLocation(){          
		return service.getAll();
	}
	
	@GetMapping("/campus/{id}")
	public Optional<Vitcampus> getLocationById(@PathVariable String id){          // to get records of single employee
		return service.getById(id);
	}
	
	@PutMapping("/campus/{id}")
	public Vitcampus updateLocation(@PathVariable String id, @Validated @RequestBody Vitcampus vitcamp) {    // to update the details of the employee
		return service.update(id,vitcamp);
	}
	
	@DeleteMapping("/campus/{id}")
	public String deleteLocation(@PathVariable String id) {                         // to delete and employee value by id
		service.delete(id);
		return "Vit campus with id : " + id + " deleted Successfully";
	}
	
}
