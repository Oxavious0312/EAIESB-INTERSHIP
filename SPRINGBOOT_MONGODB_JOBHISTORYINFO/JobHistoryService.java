package com.eaiesb.JobHistory;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JobHistoryService {

	@Autowired
	public JobHistoryRepository jobRepo;
	
	public JobHistory create(JobHistory job) {
		return jobRepo.save(job);
	}
	
	public List<JobHistory> getAll(){            // to get the list of all locations
		return jobRepo.findAll();
	}
	
	public Optional<JobHistory> getById(String id){    // to get the details of a single location
		return jobRepo.findById(id);
	}
	
	public JobHistory update(String id,JobHistory job) {   // to update the location details
		job.setId(id);
		return jobRepo.save(job);
	}
	
	public String delete(String id) {                       // to delete and location value by id
		jobRepo.deleteById(id);
		return "JobHistory with id : " + id + " deleted Successfully";
	}
}
