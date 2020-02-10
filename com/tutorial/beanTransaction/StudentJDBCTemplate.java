package com.tutorial.beanTransaction;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.*;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	private PlatformTransactionManager transactionManager;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager){
		this.transactionManager = transactionManager;
	}

	@Override
	public void create(String name, Integer age, Integer mark, Integer year) {
		TransactionDefinition def = new DefaultTransactionDefinition();
	      TransactionStatus status = transactionManager.getTransaction(def);

	      try {
	         String SQL1 = "insert into Student (name, age) values (?, ?)";
	         jdbcTemplateObject.update( SQL1, name, age);

	         // Get the latest student id to be used in Marks table
	         String SQL2 = "select max(id) from Student";
	         int sid = jdbcTemplateObject.queryForObject( SQL2, new Object[]{0}, Integer.class );

	         String SQL3 = "insert into Marks(sid, marks, year) " + "values (?, ?, ?)";
	         jdbcTemplateObject.update( SQL3, sid, mark, year);

	         System.out.println("Created Name = " + name + ", Age = " + age);
	         transactionManager.commit(status);
	      } 
	      catch (DataAccessException e) {
	         System.out.println("Error in creating record, rolling back");
	         transactionManager.rollback(status);
	         throw e;
	      }
	      return;
	}

	@Override
	public List<StudentMark> listStudents() {
		String SQL = "select * from Student, Marks where Student.id=Marks.sid";
		List <StudentMark> students = jdbcTemplateObject.query(SQL,  new StudentMarkMapper());
		
		return students;
	}
}
