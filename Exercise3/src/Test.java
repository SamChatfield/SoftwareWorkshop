
public class Test
{
	
	public static void main(String[] args)
	{
		
		Module sw = new Module("Software Workshop", "Jon Rowe");
		
		System.out.println(sw);
		
		System.out.println(sw.getName());
		System.out.println(sw.getLecturer());
		
		System.out.println("changing lecturer");
		sw.setLecturer("Martin Escardo");
		
		System.out.println(sw);
		
		Student alf = new Student("Alfred Smith", 12345);
		
		System.out.println(alf);
		System.out.println(alf.getName());
		System.out.println(alf.getId());
		
		System.out.println("changing id");
		alf.setId(54321);
		System.out.println(alf);
		
		alf.setModule(0, sw);
		alf.setModule(1, new Module("Foundations", "Dan Ghica"));
		alf.setModule(2, new Module("Intro to AI", "Volker Sorge"));
		
		//System.out.println(alf.getModule(1));
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(alf.getModule(i));
		}
		
		// Test Question 1
		// First test software workshop against foundations for a false return
		if (sw.equals(alf.getModule(1)))
		{
			System.out.println(sw.getName() + " equals " + alf.getModule(1).getName());
		}
		else
		{
			System.out.println(sw.getName() + " is not equal to " + alf.getModule(1).getName());
		}
		// Now test software workshop object against alf.getModule(0) for true return
		if (alf.getModule(0).equals(sw))
		{
			System.out.println(alf.getModule(0).getName() + " equals " + sw.getName());
		}
		else
		{
			System.out.println(alf.getModule(0).getName() + " is not equal to " + sw.getName());
		}
		
		// Test Question 2
		// Test if on software workshop for true return
		if (alf.onModule(sw))
		{
			System.out.println("Alfred is on " + sw.getName());
		}
		else
		{
			System.out.println("Alfred isn't on " + sw.getName());
		}
		// Create new module, Language and Logic and test if on it for false return
		Module ll = new Module("Language and Logic", "Mark Lee");
		if (alf.onModule(ll))
		{
			System.out.println("Alfred is on Language and Logic");
		}
		else
		{
			System.out.println("Alfred isn't on Language and Logic");
		}
		
		// Test Question 3
		// Test constructor
		TutorGroup tg = new TutorGroup("Alan Sexton");
		// Test getter and setter for tutor and toString
		System.out.println("Tutor: " + tg.getTutor());
		tg.setTutor("Dan Ghica");
		System.out.println(tg.toString());
		// Test addStudent and getStudents
		tg.addStudent(alf);
		Student garry = new Student("Garry Brown", 13579);
		tg.addStudent(garry);
		System.out.println(tg.getStudents());
		
		// Test Question 4
	}
	
}
