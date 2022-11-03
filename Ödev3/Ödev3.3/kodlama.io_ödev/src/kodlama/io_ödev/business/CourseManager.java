package kodlama.io_ödev.business;

import java.util.List;

import kodlama.io_ödev.core.log.Logger;
import kodlama.io_ödev.dataAccess.CourseDao;
import kodlama.io_ödev.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Logger> loggers;
	private List<Course> courses;
	
	public CourseManager() {
		super();
	}

	public CourseManager(CourseDao courseDao, List<Logger> loggers, List<Course> courses) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	public void add(Course course) throws Exception {
		if(course.getPrice()<0) {
			throw new Exception("The price can not be negative.");
		}
		for(Course crs:courses) {
			if((crs.getCourseName()==course.getCourseName() || crs.getId() == course.getId()) && crs != course) {
				throw new Exception("The course id and name can not be repeated.");
			}
		}
		
		courses.add(course);
		courseDao.add(course);
		
		for(Logger log:loggers) {
			log.log(course.getCourseName());
		}
	}
	

}
