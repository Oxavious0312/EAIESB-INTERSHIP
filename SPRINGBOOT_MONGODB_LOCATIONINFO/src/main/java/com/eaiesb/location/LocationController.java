package com.eaiesb.location;

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
public class LocationController {

	@Autowired
	public LocationService service;
	
	@PostMapping("/location")
	public Location createLocation(@Validated @RequestBody Location loc) {
		return service.create(loc);
	}
	
	@GetMapping("/location")
	public List<Location> getAllLocation(){          
		return service.getAll();
	}
	
	@GetMapping("/location/{id}")
	public Optional<Location> getLocationById(@PathVariable String id){          // to get records of single employee
		return service.getById(id);
	}
	
	@PutMapping("/location/{id}")
	public Location updateLocation(@PathVariable String id, @Validated @RequestBody Location loc) {    // to update the details of the employee
		return service.update(id,loc);
	}
	
	@DeleteMapping("/location/{id}")
	public String deleteLocation(@PathVariable String id) {                         // to delete and employee value by id
		service.delete(id);
		return "Location with id : " + id + " deleted Successfully";
	}
	
	
}
