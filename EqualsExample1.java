package Srtingmethods;

public class EqualsExample1 {
	public static void main(String aargs[])
	{
		String s1="facenow";
		String s2="facenow";
		String s3="faceprep";
		String s4="faceint";
		System.out.println(s1.equals(s2));//true because content and case are same
		System.out.println(s1.equals(s3));//false strings not equal
		System.out.println(s1.equals(s4));//false strings not equal
	}

}
