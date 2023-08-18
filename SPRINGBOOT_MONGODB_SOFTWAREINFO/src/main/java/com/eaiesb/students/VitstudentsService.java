package com.eaiesb.students;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class VitstudentsService {
	
	@Autowired
	public VitstudentsRepository VitstuRepo;
	
	public Vitstudents create(Vitstudents loc) {
		return VitstuRepo.save(loc);
	}
	
	public List<Vitstudents> getAll(){            // to get the list of all locations
		return VitstuRepo.findAll();
	}
	
	public Optional<Vitstudents> getById(String id){    // to get the details of a single location
		return VitstuRepo.findById(id);
	}
	
	public Vitstudents update(String id,Vitstudents vitstu) {   // to update the location details
		vitstu.setId(id);
		return VitstuRepo.save(vitstu);
	}
	
	public String delete(String id) {                       // to delete and location value by id
		VitstuRepo.deleteById(id);
		return "VIT student with id : " + id + " deleted Successfully";
	}
	
	public List<Vitstudents> getBydepid(String depid){
		return VitstuRepo.findBydepid(depid);
	}
	
	public List<Vitstudents> getByCampidDepid(String campid){
		return VitstuRepo.findBycampid(campid);
	}
	
	public List<Vitstudents> getStudentsByDepartmentAndCampus(String depid, String campid) {
        return VitstuRepo.findByDepidAndCampid(depid, campid);
    }
	
	 
}
