package Srtingmethods;

public class charAtExample4 {
	public static void main(String[] args) {
		String str="Welcome to FACE portal";
		int c=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)=='t')//checking value in i th index id is equal to t.
			{
				c++;
			}
			
		}
		System.out.println("frequency of t is: "+c);
	}

}
