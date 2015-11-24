
public class TestArrayList
{
	
	public static void main(String[] args)
	{
		MyArrayList al = new MyArrayList();
		for (int i=1; i<=50; i++)
		{
			al.add("String " + i);
		}
		System.out.println(al.toString());
		System.out.println(al.get(-1));
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(10));
		System.out.println(al.get(14));
		System.out.println(al.get(27));
		System.out.println(al.get(44));
		System.out.println(al.get(49));
		System.out.println(al.get(50));
	}
	
}
