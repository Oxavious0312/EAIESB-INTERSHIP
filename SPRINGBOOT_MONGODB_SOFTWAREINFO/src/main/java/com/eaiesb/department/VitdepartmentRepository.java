package com.eaiesb.department;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VitdepartmentRepository extends MongoRepository<Vitdepartment,String>{

	List<Vitdepartment> findByCampid(String campid);
	
	

	
//	public static Vitdepartment getdept(String campid,Vitdepartment dep) {
//		dep.setCampid(campid);
//		return 
//	}
	
}

