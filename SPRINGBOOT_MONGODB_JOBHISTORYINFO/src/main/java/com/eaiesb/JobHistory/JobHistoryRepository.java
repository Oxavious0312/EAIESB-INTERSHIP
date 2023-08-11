package com.eaiesb.JobHistory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobHistoryRepository extends MongoRepository<JobHistory,String> {
	

}
