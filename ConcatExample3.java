package Srtingmethods;

public class ConcatExample3 {
	public static void main(String argfs[])
	{
		String s1= "Hello";
		String s2= "Face@2.0";
		String s3= "Reader";
		//Concatenating space among Strings
		String s4=s1.concat(" ").concat(s2).concat(" ").concat(s3);
		System.out.println(s4);
		//concatenating speial chars
		String s5=s1.concat("!!!");
		System.out.println(s5);
		String s6=s1.concat("@").concat(s2);
		System.out.println(s6);
	}

}
