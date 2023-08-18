package com.eaiesb.vit;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VitcampusRepository extends MongoRepository<Vitcampus, String> {
	

}
