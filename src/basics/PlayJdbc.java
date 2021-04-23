package basics;   
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basics.dao.StudentDao;
import basics.dao.StudentDaoImp;
import basics.model.*;

public class PlayJdbc {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student myStudent = new Student(3, "sanjay", 4, 75);
		Student anotherStudent= new Student(4, "subbu", 1, 90);
		Student anotherStudent4= new Student(8, "verdu", 5, 75);
		/*Student anotherStudent2= new Student(6, "rakesh", 1, 15);
		Student anotherStudent3= new Student(7, "harish", 8, 16);*/
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		studentDao.insert(anotherStudent4);
			
		}	
	}
