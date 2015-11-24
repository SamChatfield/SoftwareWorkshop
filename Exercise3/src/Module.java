
public class Module
{
	
	private String name;
	private String lecturer;
	
	public Module(String name, String lecturer)
	{
		this.name = name;
		this.lecturer = lecturer;
	}
	
	public String toString()
	{
		return "Module: " + this.name + ", " + this.lecturer;
	}
	
	public boolean equals(Module module)
	{
		return this.getName().equalsIgnoreCase(module.getName());
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getLecturer()
	{
		return this.lecturer;
	}
	
	public void setLecturer(String lecturer)
	{
		this.lecturer = lecturer;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
}
