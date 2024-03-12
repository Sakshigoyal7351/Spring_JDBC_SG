package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Student;

public class StudentDaoImpl implements StudentDao
{

	private JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public StudentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r=jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		
		return r;
	}

	public int update(Student student) {
		
		String query="update student set name=?, city=? where id=? ";
		int r=jdbcTemplate.update(query,student.getName(), student.getCity(), student.getId());
		
		return r;
	}

	public int delete(int sid) {
		String query="delete from student where id=?";
		int r=jdbcTemplate.update(query,sid);
		return r;
	}

	public Student getStudent(int sid) {
		String query="select * from student where id=?";
		RowMapper<Student> row = new RowMapperImpl();
		Student student =jdbcTemplate.queryForObject(query, row, sid);
		return student;
	}

	public List<Student> getAllStudent() {
		String query="select * from student";
		RowMapper<Student> row = new RowMapperImpl();
		List<Student> students= jdbcTemplate.query(query, row);
		return students;
	}

	
}
