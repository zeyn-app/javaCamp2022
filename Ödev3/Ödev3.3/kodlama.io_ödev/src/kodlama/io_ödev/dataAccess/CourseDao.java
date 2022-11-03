package kodlama.io_ödev.dataAccess;

import kodlama.io_ödev.entities.Course;

public interface CourseDao {
	public void add(Course course) ;
	public void delete(Course course);
	public void update(Course course);

}
