import java.util.*;
public class stringLiteralObject
{
	public static void main(String args[])
	{
		String str1="hello";
		String str2="hello";
		if(str1.equals(str2))
			System.out.println("Both variables point to the same object: true ");
		else
			System.out.println("Both variables point to the same object: false ");
	}
}