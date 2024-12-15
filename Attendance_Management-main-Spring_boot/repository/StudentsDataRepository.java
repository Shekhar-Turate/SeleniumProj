package com.project.Attendance_Management.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.Attendance_Management.model.Attendance;
import com.project.Attendance_Management.model.StudentsData;

@Repository
public interface StudentsDataRepository extends MongoRepository<StudentsData, BigInteger>{ 

	List<StudentsData> findByPrn(int prn);

}
