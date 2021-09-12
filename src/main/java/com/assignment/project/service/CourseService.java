package com.assignment.project.service;

import java.util.*;

import com.assignment.project.model.Course;

public interface CourseService {
	List<Course> getAllCourses();
	
	Course add(Course course);
	
	String delete(Long id);
	
	Course update(Course course);

}
