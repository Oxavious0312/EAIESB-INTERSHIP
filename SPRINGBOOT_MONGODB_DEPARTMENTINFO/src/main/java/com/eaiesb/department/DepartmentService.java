package com.eaiesb.department;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentService {

		@Autowired
		public DepartmentRepository depRepo;
		
		public Department create(Department dep) {
			return depRepo.save(dep);
		}
		
		public List<Department> getAll(){            // to get the list of all locations
			return depRepo.findAll();
		}
		
		public Optional<Department> getById(String id){    // to get the details of a single location
			return depRepo.findById(id);
		}
		
		public Department update(String id,Department dep) {   // to update the location details
			dep.setId(id);
			return depRepo.save(dep);
		}
		
		public String delete(String id) {                       // to delete and location value by id
			depRepo.deleteById(id);
			return "Department with id : " + id + " deleted Successfully";
		}
		
}
