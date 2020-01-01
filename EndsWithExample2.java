package Srtingmethods;

public class EndsWithExample2 
{
	public static void main(String args[])
	{
		String s1="Welcome to FACE.in";
		System.out.println(s1.endsWith("in"));//true String end with 'in'
		if(s1.endsWith(".com"))
		{
			System.out.println("String ends with .com");
			
		}
		else
		{
			System.out.print("It does not end with .com" );//else part will print 
		}
	}

}
