package com.eaiesb.vit;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VitcampusService {
	
	@Autowired
	public VitcampusRepository VitcampRepo;
	
	public Vitcampus create(Vitcampus loc) {
		return VitcampRepo.save(loc);
	}
	
	public List<Vitcampus> getAll(){            // to get the list of all locations
		return VitcampRepo.findAll();
	}
	
	public Optional<Vitcampus> getById(String id){    // to get the details of a single location
		return VitcampRepo.findById(id);
	}
	
	public Vitcampus update(String id,Vitcampus vitcamp) {   // to update the location details
		vitcamp.setId(id);
		return VitcampRepo.save(vitcamp);
	}
	
	public String delete(String id) {                       // to delete and location value by id
		VitcampRepo.deleteById(id);
		return "VIT campus with id : " + id + " deleted Successfully";
	}
	
}
