package basics;   
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import basics.dao.StudentDao;
import basics.dao.StudentDaoImp;
import basics.model.*;

public class PlayJdbc {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDaoImp studentDao = (StudentDaoImp) context.getBean("studentDao");
		//studentDao.delRecordByNameSem("ansari", 4);
		//insertStudent(studentDao);
		//studentDao.delRecordById(8);
		studentDao.cleanUp();
		
		
	}


	private static void insertStudent(StudentDao studentDao) {
		Student myStudent = new Student(3, "sanjay", 4, 75);
		Student anotherStudent= new Student(10, "hello", 5, 80);
		/*Student anotherStudent4= new Student(9, "sujatha", 3, 85);
		Student anotherStudent2= new Student(6, "rakesh", 1, 15);
		Student anotherStudent3= new Student(7, "harish", 8, 16);*/
		studentDao.insert(anotherStudent);
	}

}