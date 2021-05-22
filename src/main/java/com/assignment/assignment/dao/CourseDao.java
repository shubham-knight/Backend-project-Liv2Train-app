package com.assignment.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.assignment.entities.TrainingCenter;

//Dao Layer for database connectivity
public interface CourseDao extends JpaRepository<TrainingCenter, String>{
	
}
