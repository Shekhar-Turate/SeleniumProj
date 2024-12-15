package com.project.Attendance_Management.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.Attendance_Management.model.Attendance;

@Repository
public interface AttendanceRepository extends MongoRepository<Attendance, String>{


	List<Attendance> findByDateNull();
	List<Attendance> findByPrn(int prn);
	//List<Attendance> findByCourse_idLike(String course_id);
	
	
}
