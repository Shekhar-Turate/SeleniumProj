package com.project.Attendance_Management.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.Attendance_Management.model.detected_prn;

@Repository
public interface detected_prnRepository  extends MongoRepository<detected_prn, Integer>{ 

	
}
