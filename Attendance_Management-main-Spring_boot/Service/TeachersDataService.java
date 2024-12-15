package com.project.Attendance_Management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Attendance_Management.model.TeachersData;
import com.project.Attendance_Management.repository.TeachersDataRepository;

@Service

public class TeachersDataService {
	
	@Autowired
	public TeachersDataRepository repository;

	public void save(TeachersData data)   
	{  
		repository.save(data);  
	}
	
	public List<TeachersData> getAllData() {
	    return repository.findAll();
	  }
	
}
