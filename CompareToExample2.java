package Srtingmethods;

public class CompareToExample2 
{
	public static void main(String[] args)
	{
		String s1="hello";
		String s2="";
		String s3="me";
		System.out.println(s1.compareTo(s2));//s2 is null so return the length of the string s1
		System.out.print(s1.compareTo(s3));
		
	}

}
