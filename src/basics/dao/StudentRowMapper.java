package basics.dao;

import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowCallbackHandler;
import basics.model.Student;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id = rs.getInt("_id");
		String name = rs.getString("name");
		int sem = rs.getInt("sem");
		int avg = rs.getInt("average");
		Student newStudent = new Student(id,name,sem,avg);
		
		return newStudent;
	}



}