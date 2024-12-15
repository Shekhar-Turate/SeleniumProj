package com.project.Attendance_Management.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.Attendance_Management.model.TeachersData;

@Repository
public interface TeachersDataRepository extends MongoRepository<TeachersData, String>{ 

}
