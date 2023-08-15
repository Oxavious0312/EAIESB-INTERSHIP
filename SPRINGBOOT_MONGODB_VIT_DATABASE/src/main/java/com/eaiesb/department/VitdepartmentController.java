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
public class VitdepartmentController {
	
	@Autowired
	public VitdepartmentService service;
	
	@PostMapping("/department")
	public Vitdepartment createLocation(@Validated @RequestBody Vitdepartment vitdep) {
		return service.create(vitdep);
	}
	
	@GetMapping("/department")
	public List<Vitdepartment> getAllLocation(){          
		return service.getAll();
	}
	
	@GetMapping("/departmentS/{id}")
	public Optional<Vitdepartment> getLocationById(@PathVariable String id){          // to get records of single employee
		return service.getById(id);
	}
	
	@PutMapping("/department/{id}")
	public Vitdepartment updateLocation(@PathVariable String id, @Validated @RequestBody Vitdepartment vitdep) {    // to update the details of the employee
		return service.update(id,vitdep);
	}
	
	@DeleteMapping("/department/{id}")
	public String deleteLocation(@PathVariable String id) {                         // to delete and employee value by id
		service.delete(id);
		return "Vit department with id : " + id + " deleted Successfully";
	}
	

	@GetMapping("/department/{campid}")
	public List<Vitdepartment> getDeptId(@PathVariable String campid) {
        return service.getByCampId(campid);
    }
	
	
	
	
	
}
