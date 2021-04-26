package basics.dao;   

import java.util.ArrayList;
import java.util.List;

import basics.model.*;

public interface StudentDao {
	void insert(Student student);
	void insert(List<Student> students);
	void delRecordById(int id);
	int delRecordByNameSem(String studentName, int sem);
	List<Student> getAllStudents();
	
	Student findStudentById(int id);





}
