package com.assignment.assignment.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.assignment.dao.CourseDao;
import com.assignment.assignment.entities.TrainingCenter;

//We are at service layer
@Service
public class TrainingServiceImpl implements TrainingService{
	
	@Autowired
	private CourseDao courseDao;
	
	public TrainingServiceImpl() {

	}
	
	@Override
	public List<TrainingCenter> getCenters() {
		return courseDao.findAll();
	}
	

	@Override
	public TrainingCenter getCenter(String centerID) {
		return courseDao.getOne(centerID);
	}

	@Override
	public TrainingCenter addCenter(TrainingCenter center) {
		courseDao.save(center);
		return center;
	}

	@Override
	public TrainingCenter updateCenter(TrainingCenter center) {
		courseDao.save(center);
		return center;
	}

	@Override
	public void deleteCourse(String centerID) {
		TrainingCenter temp= courseDao.getOne(centerID);
		courseDao.delete(temp);	
	}
	
	

}
