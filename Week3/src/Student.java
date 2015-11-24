
public class Student {
	
	private String name;
	private int ID;
	
	public Student(String name, int ID) {
		this.name = name;
		this.ID = ID;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nID: " + this.ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
}
