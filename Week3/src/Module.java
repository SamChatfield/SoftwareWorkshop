
public class Module {
	
	// class attributes
	private String name;
	private String lecturer;
	
	public Module(String name, String lecturer) {
		this.name = name;
		this.lecturer = lecturer;
	}
	
	public String toString() {
		return "Module: " + this.name + ", " + this.lecturer;
	}
	
	// getters
	
	public String getName() {
		return this.name;
	}
	
	public String getLecturer() {
		return this.lecturer;
	}
	
	// setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	
}
