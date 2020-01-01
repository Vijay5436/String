package Srtingmethods;

public class ContainsExample2
{
	public static void main(String args[])
	{
		String str="Hello F#A#C#E@2.0 readers";
		boolean iscontains =str.contains("F#A#C#E");
		System.out.println(iscontains);
		//case Sensitive
		System.out.print(str.contains("FACe"));
	}

}
