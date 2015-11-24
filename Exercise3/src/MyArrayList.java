
public class MyArrayList
{
	
	private String[] strings;
	private int maxSize;
	private int curSize;
	
	public MyArrayList()
	{
		maxSize = 10;
		curSize = 0;
		strings = new String[maxSize];
	}
	
	public void add(String string)
	{
		if (curSize < maxSize)
		{
			strings[curSize] = string;
			curSize++;
		}
		else
		{
			maxSize += 10;
			String[] moreStrings = new String[maxSize];
			for (int i=0; i<strings.length; i++)
			{
				moreStrings[i] = strings[i];
			}
			strings = moreStrings;
			strings[curSize] = string;
			curSize++;
		}
	}
	
	public String get(int i)
	{
		if (i >= 0 && i < curSize)
		{
			return strings[i];
		}
		// throw new IndexOutOfBoundsException();
		System.out.println("Error: Index out of bounds");
		return null;
	}
	
	public String toString()
	{
		String out = "";
		for (String s : strings)
		{
			out = out + s + " ";
		}
		return out;
	}
	
}
