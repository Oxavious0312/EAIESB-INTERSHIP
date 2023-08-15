package com.eaiesb.department;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VitdepartmentService {
	
	@Autowired
	public VitdepartmentRepository VitdepRepo;
	
    
	
	public Vitdepartment create(Vitdepartment loc) {
		return VitdepRepo.save(loc);
	}
	
	public List<Vitdepartment> getAll(){            // to get the list of all locations
		return VitdepRepo.findAll();
	}
	
	public Optional<Vitdepartment> getById(String id){    // to get the details of a single location
		return VitdepRepo.findById(id);
	}
	
	public Vitdepartment update(String id,Vitdepartment vitdep) {   // to update the location details
		vitdep.setId(id);
		return VitdepRepo.save(vitdep);
	}
	
	public String delete(String id) {                       // to delete and location value by id
		VitdepRepo.deleteById(id);
		return "VIT department with id : " + id + " deleted Successfully";
	}
	
	
	public List<Vitdepartment> getByCampId(String campid) {
        return VitdepRepo.findByCampid(campid);
    }
	
}
