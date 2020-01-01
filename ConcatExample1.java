package Srtingmethods;

public class ConcatExample1 
{
	public static void main(String[] args)
	{
		String s1="java string";
		s1.concat(" is mutable");
		System.out.println(s1);//concat dose't occur
		s1=s1.concat(" is immutable so assign it explicitly");
		System.out.print(s1);
	}

}
