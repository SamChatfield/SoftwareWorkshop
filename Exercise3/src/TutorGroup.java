import java.util.ArrayList;

public class TutorGroup
{
	
	private String tutor;
	private ArrayList<Student> students;
	
	public TutorGroup(String tutor)
	{
		this.tutor = tutor;
		students = new ArrayList<Student>();
	}
	
	public String toString()
	{
		return "Tutor Group\n===========\nTutor: " + this.tutor;
	}
	
	public void addStudent(Student student)
	{
		students.add(student);
	}
	
	public ArrayList<Student> getStudents()
	{
		return students;
	}
	
	public String getTutor()
	{
		return this.tutor;
	}
	
	public void setTutor(String tutor)
	{
		this.tutor = tutor;
	}
	
}
