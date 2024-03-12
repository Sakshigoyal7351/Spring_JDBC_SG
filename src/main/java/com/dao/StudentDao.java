package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {

	public int insert(Student student);
	public int update(Student student);
	public int delete(int sid);
	public Student getStudent(int sid);
	public List<Student> getAllStudent();
	
}
