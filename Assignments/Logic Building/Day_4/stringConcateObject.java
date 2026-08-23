import java.util.*;
public class stringConcateObject
{
	public static void main(String args[])
	{
		String str1="hello";
		String str2=" world";
		String str3=str1 + str2;
		if(str1==str3)
			System.out.println("Is str3 pointing to the same object as str1?: true ");
		else
			System.out.println("Is str3 pointing to the same object as str1?: false ");
	}
}