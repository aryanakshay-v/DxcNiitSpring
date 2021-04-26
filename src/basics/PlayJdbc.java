package basics;   
import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import basics.dao.StudentDao;
import basics.dao.StudentDaoImp;
import basics.model.*;

public class PlayJdbc {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		/*StudentDaoHelper helper = context.getBean("studentDaoHelper",StudentDaoHelper.class);
		helper.insertStudents();
		 */

		StudentDaoImp studentDao = (StudentDaoImp) context.getBean("studentDao");

		//System.out.println(studentDao.findStudentById(5));


		List<Student> students = studentDao.getAllStudents();
		printStudents(students);


		//studentDao.delRecordByNameSem("ansari", 4);
		//insertStudent(studentDao);
		//studentDao.delRecordById(8);
		//studentDao.cleanUp();


	}

	private static void printStudents(List<Student> students) {
		for(Student s : students) {
			System.out.println(s);
		}
	}



	private static void insertStudent(StudentDao studentDao) {
		Student myStudent = new Student(13, "sanjay", 4, 75);
		Student anotherStudent1= new Student(14, "hello", 5, 80);
		studentDao.insert(anotherStudent1);
	}

}