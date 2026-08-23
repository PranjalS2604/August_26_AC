import java.util.*;
public class reverseString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String name=sc.next();
		String str=" ";
		for(int i=name.length()-1;i>=0;i--)
		{
			str=str + name.charAt(i);
		}
		System.out.println("Reversed String: "+str);
	}
}