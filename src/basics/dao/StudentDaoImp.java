package basics.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import basics.model.Student;

@Repository("studentDao")

public class StudentDaoImp implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void insert(Student student) {
		String sql = "INSERT INTO student VALUES (?,?,?,?)";
		Object[] objects =	{student.getId(),student.getName(),student.getSem(),student.getAverage()};

		int no_rows_inserted =	jdbcTemplate.update(sql,objects);
		System.out.println("no of rows inserted  is "+ no_rows_inserted);
	}
	
	

	@Override
	public void delRecordById(int id) {
		String delSql = "DELETE FROM STUDENT WHERE _id = ?";
		int noRecordsDeleted = jdbcTemplate.update(delSql,id);
		System.out.println("no of records deleted = "+ noRecordsDeleted);
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public int delRecordByNameSem(String studentName, int sem) {
		String sql = "DELETE FROM STUDENT WHERE name = ? OR sem = ?"; //replace OR with AND and see the results
		Object[] objects = {studentName,sem};
		int noRecordsDeleted = jdbcTemplate.update(sql, objects);
		System.out.println("no of records deleted ="+ noRecordsDeleted);
		return noRecordsDeleted;
		
	}
	
	public void cleanUp() {
		String sql = "TRUNCATE TABLE STUDENT";
		jdbcTemplate.update(sql);
		System.out.println("table cleaned");
	}





}

