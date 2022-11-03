package kodlama.io_ödev.dataAccess;

import kodlama.io_ödev.entities.Instructor;

public interface InstructorDao {
	public void add(Instructor instructor);
	public void delete(Instructor instructor);
	public void update(Instructor instructor);
	public void addCourse(Instructor instructor);
}
