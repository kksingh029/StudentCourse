package com.assignment.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.project.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

	
	List<Course> findByStudentsIsEmpty();
}
