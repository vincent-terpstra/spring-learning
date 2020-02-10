package com.tutorial.beanSQL;

import java.util.List;
import javax.sql.DataSource;

/**
 * Data Access Object for the Student table
 * @author Vincent Terpstra
 */
public interface StudentDAO {
	//Method to initialize the connection to the database resource		
	public void setDataSource(DataSource ds);
	
	//Method to CREATE an instance in the Student Table
	public void create(String name, Integer age);
	
	//Method to list down a record from the Student table corresponding to ID
	public Student getStudent(Integer id);
	
	//Method to list all Students from the Student Table
	public List<Student> listStudents();
	
	//Method to UPDATE a record into the Student Table
	public void update(Integer id, Integer age);
	
	//Method to DELETE a Student from Student Table
	public void delete(Integer id);
}
