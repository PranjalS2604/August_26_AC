import java.util.*;
public class checkPalindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String name=sc.nextLine();
		name=name.toLowerCase();
		String str="";
		for(int i=name.length()-1;i>=0;i--)
		{
			str=str + name.charAt(i);
		}
		if(name.equals(str)) 
		{
            		System.out.println("The string is a Palindrome.");
        	} 
		else 
		{
            		System.out.println("The string is NOT a Palindrome.");
        	}
	}
}