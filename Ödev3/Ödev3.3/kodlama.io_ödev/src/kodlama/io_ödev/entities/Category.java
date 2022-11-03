package kodlama.io_ödev.entities;

public class Category {
	private int id;
	private String name;
	private int courseNumber;
	
	public Category() {
		super();
	}
	public Category(int id, String name, int courseNumber) {
		super();
		this.id = id;
		this.name = name;
		this.courseNumber = courseNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	
}
