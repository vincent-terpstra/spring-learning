package com.tutorial.beanTransaction;

import java.util.List;
import javax.sql.DataSource;

/**
 * Data Access Object for the Student table ( and marks )
 * 
  CREATE table Student(
  	ID INT NOT NULL AUTO_INCREMENT,
  	NAME VARCHAR(20) NOT NULL,
  	AGE IN NOT NULL,
  	PRIMARY KEY(ID)
  );
  
  CREATE table Marks(
  	SID INT NOT NULL,
  	MARKS INT NOT NULL,
  	YEAR  INT NOT NULL
  );
 */
public interface StudentDAO {
	//Method to initialize the connection to the database resource		
	public void setDataSource(DataSource ds);
	
	//Method to CREATE an instance in the Student Table and the Mark table
	public void create(String name, Integer age, Integer mark, Integer year);
	
	//Method to list all Students from the Student Table
	public List<StudentMark> listStudents();
}
