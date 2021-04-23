package basics.dao;   

import basics.model.*;

public interface StudentDao {
	public void insert(Student student);

	void delRecordById(int id);

}
