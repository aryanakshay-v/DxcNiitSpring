package basics;   
import basics.dao.StudentDao;
import basics.dao.StudentDaoImp;
import basics.model.*;

public class PlayJdbc {

	public static void main(String[] args) {
		Student myStudent = new Student(3, "sanjay", 4, 75);
		Student anotherStudent= new Student(4, "subbu", 1, 90);
		Student anotherStudent1= new Student(5, "subbu1", 3, 55);
		StudentDao studentDao = new StudentDaoImp();
		studentDao.insert(myStudent);
		
			
		}	
	}
