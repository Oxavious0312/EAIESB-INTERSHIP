package com.eaiesb.students;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VitstudentsRepository extends MongoRepository<Vitstudents,String> {
	
	List<Vitstudents> findBydepid(String depid);
	
}