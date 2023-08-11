package com.eaiesb.JobHistory;

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
public class JobHistoryController {
	
	@Autowired
	public JobHistoryService service;
	
	@PostMapping("/jobhistory")
	public JobHistory createLocation(@Validated @RequestBody JobHistory job) {
		return service.create(job);
	}
	
	@GetMapping("/jobhistory")
	public List<JobHistory> getAllLocation(){          
		return service.getAll();
	}
	
	@GetMapping("/jobhistory/{id}")
	public Optional<JobHistory> getLocationById(@PathVariable String id){          // to get records of single employee
		return service.getById(id);
	}
	
	@PutMapping("/jobhistory/{id}")
	public JobHistory updateLocation(@PathVariable String id, @Validated @RequestBody JobHistory job) {    // to update the details of the employee
		return service.update(id,job);
	}
	
	@DeleteMapping("/jobhistory/{id}")
	public String deleteJobHistory(@PathVariable String id) {                         // to delete and employee value by id
		service.delete(id);
		return "JobHistory with id : " + id + " deleted Successfully";
	}
}
