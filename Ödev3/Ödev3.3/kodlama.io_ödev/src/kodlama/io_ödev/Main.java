package kodlama.io_ödev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kodlama.io_ödev.business.CategoryManager;
import kodlama.io_ödev.business.CourseManager;
import kodlama.io_ödev.business.InstructorManager;
import kodlama.io_ödev.core.log.DataBaseLogger;
import kodlama.io_ödev.core.log.FileLogger;
import kodlama.io_ödev.core.log.Logger;
import kodlama.io_ödev.core.log.MailLogger;
import kodlama.io_ödev.dataAccess.HibernateCourseDao;
import kodlama.io_ödev.dataAccess.InstructorDao;
import kodlama.io_ödev.dataAccess.JdbcCategoryDao;
import kodlama.io_ödev.dataAccess.JdbcCourseDao;
import kodlama.io_ödev.dataAccess.JdbcIstructorDao;
import kodlama.io_ödev.entities.Category;
import kodlama.io_ödev.entities.Course;
import kodlama.io_ödev.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		List <Logger> loggers = Arrays.asList(new DataBaseLogger(), new FileLogger(), new MailLogger());
		List <Course> courses = new ArrayList<>();
		List <Category> categories = new ArrayList<>();
		List <Instructor> instructors = new ArrayList<>();
				
		
		Instructor instructor = new Instructor(1, "Kemal", "Özkan");
		Instructor instructor1 = new Instructor(1, " ", "Özkan");
		
		InstructorManager instructorManager = new InstructorManager(new JdbcIstructorDao(), loggers, instructors);
		instructorManager.add(instructor);
		//instructorManager.add(instructor1);
		
		
		
		Course course = new Course(1, "javaCamp", "22.05.2022", "25.10.2022", "Engin Demiroğ", 500, 50, false);
		Course course1 = new Course(1, "javaCAmp", "22.05.2022", "25.10.2022", "Engin Demiroğ", 500, 50, false);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(course);
		//courseManager.add(course1);
		
		
		
		Category category = new Category(5, "education", 4);
		Category category1 = new Category(5, "art", 4);
				
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
		categoryManager.add(category);
		//categoryManager.add(category1);
		
		
	}

}
