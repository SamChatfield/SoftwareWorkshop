
public class Test {
	
	public static void main(String[] args) {
		Module sw = new Module("Software Workshop", "Jon Rowe");
		
		System.out.println(sw);
		sw.setName("Get Hype");
		sw.setLecturer("Dr Dan");
		System.out.println(sw);
		System.out.println(sw.getName());
		System.out.println(sw.getLecturer());
		
		Student garry = new Student("Garry", 1234);
		
		System.out.println(garry);
		garry.setName("The One And Only Garry");
		garry.setID(12345678);
		System.out.println(garry.getName());
		System.out.println(garry.getID());
		System.out.println(garry);
	}
	
}
