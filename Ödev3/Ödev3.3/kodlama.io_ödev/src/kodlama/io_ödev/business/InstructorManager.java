package kodlama.io_ödev.business;

import java.util.List;

import kodlama.io_ödev.core.log.Logger;
import kodlama.io_ödev.dataAccess.InstructorDao;
import kodlama.io_ödev.entities.Instructor;



public class InstructorManager {
	private InstructorDao instructorDao;
	private List <Logger> loggers;
	private List <Instructor> instructors;
	
	public InstructorManager(InstructorDao instructorDao, List <Logger> loggers, List <Instructor> instructors) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		this.instructors = instructors;
	}
	
	public void add(Instructor instructor) throws Exception {
		// In this code section the name and surname values are checked whether it is empty or not, and this code section works program throws an error message.
		if(instructor.getName()==" " && instructor.getSurname()== " ") {
			throw new Exception("Name or surname can not be empty value");
		}
				
		// Check whether the id of instructor existed.
		for(Instructor inst:instructors) {
			if(inst.getId() == instructor.getId()&& inst!=instructor) {
				throw new Exception("Instructor id can not repeated.");
			}
		}
		// If condition is provided new Instructor is added to data base by data access object.
		instructorDao.add(instructor);
		instructors.add(instructor);
		
		// Logging operation 
		for(Logger logger:loggers) {
			logger.log(instructor.getName());
		}	
	}
}
