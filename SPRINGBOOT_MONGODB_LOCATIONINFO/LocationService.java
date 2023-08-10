package com.eaiesb.location;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocationService {

		@Autowired
		public LocationRepository locRepo;
		
		public Location create(Location loc) {
			return locRepo.save(loc);
		}
		
		public List<Location> getAll(){            // to get the list of all locations
			return locRepo.findAll();
		}
		
		public Optional<Location> getById(String id){    // to get the details of a single location
			return locRepo.findById(id);
		}
		
		public Location update(String id,Location emp) {   // to update the location details
			emp.setId(id);
			return locRepo.save(emp);
		}
		
		public String delete(String id) {                       // to delete and location value by id
			locRepo.deleteById(id);
			return "Location with id : " + id + " deleted Successfully";
		}
}
