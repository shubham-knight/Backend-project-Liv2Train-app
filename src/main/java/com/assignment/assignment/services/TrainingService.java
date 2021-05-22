package com.assignment.assignment.services;

import java.util.List;

import com.assignment.assignment.entities.TrainingCenter;



public interface TrainingService {
	public List<TrainingCenter> getCenters();
	
	public TrainingCenter getCenter(String centerID);
	
	public TrainingCenter addCenter(TrainingCenter center);
	
	public TrainingCenter updateCenter(TrainingCenter center);
	
	public void deleteCourse(String centerID);
}
