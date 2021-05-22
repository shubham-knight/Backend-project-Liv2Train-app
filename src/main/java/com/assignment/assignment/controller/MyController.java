package com.assignment.assignment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.assignment.entities.TrainingCenter;
import com.assignment.assignment.services.TrainingService;


//We are at controller layer

@RestController
public class MyController {
	@Autowired
	private TrainingService trainingService;
	
	@GetMapping("/training")
	public List<TrainingCenter> getCenters(){
		return this.trainingService.getCenters();
	}
	
	@PostMapping(path="/training",consumes ="application/json")
	public TrainingCenter addCenter(@Valid @RequestBody TrainingCenter center) {
		return this.trainingService.addCenter(center);
	}
	
	@PutMapping("/training")
	public TrainingCenter updateCenter(@Valid @RequestBody TrainingCenter center) {
		return this.trainingService.updateCenter(center);
	}
	
	@DeleteMapping("/training/{centerID}")	//To delete a course
	public String deleteCourse(@PathVariable("centerID") String centerID) {
		try {
			this.trainingService.deleteCourse(centerID);
			return "Deletion Done succesfully";
		}catch (Exception e) {
			return "OOps !! No such record exist";
		}
	}
	
	
}
