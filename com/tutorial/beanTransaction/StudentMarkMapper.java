package com.tutorial.beanTransaction;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMarkMapper implements RowMapper<StudentMark> {
	public StudentMark mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentMark student = new StudentMark();
		
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		student.setMark(rs.getInt("marks"));
		student.setYear(rs.getInt("year"));
		
		return student;
	}
}
