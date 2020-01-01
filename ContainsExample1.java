package Srtingmethods;

public class ContainsExample1
{
	public static void main(String args[])
	{
		String name ="What do you know about me";
		System.out.println(name.contains("do you know"));//true this word present in string
		System.out.println(name.contains("about"));//true this word present in string
		System.out.println(name.contains("hello"));//false this word not present in string
	}

}
