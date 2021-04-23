package basics.dao;   

import java.util.ArrayList;
import java.util.List;

import basics.model.*;

public interface StudentDao {
	void insert(Student student);
	void insert(List<Student> students);
	void delRecordById(int id);
	public List<Student> getAllStudents();
	int delRecordByNameSem(String studentName, int sem);





}
