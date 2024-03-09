package Assignments;

import org.testng.annotations.Test;

public class ReverseString {

	@Test
	public void reverseString()
	{

//testing changes git
		String str="modi is my god";
		String rev=" ";
		char k;
		System.out.println("Original String :"+" "+str);
		for(int i=0;i<str.length();i++)
		{
			k=str.charAt(i);
			rev=k+rev;
		}
		System.out.println("Reversed String :"+" "+rev);
		}
}
