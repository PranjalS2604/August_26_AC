import java.util.*;
public class countVowels
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String name=sc.next();
		name=name.toLowerCase();
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
				count++;
		}
		System.out.println("The number of vowels in "+name+" is "+count);
	}
}