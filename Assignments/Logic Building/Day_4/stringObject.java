import java.util.*;
public class stringObject
{
	public static void main(String args[])
	{
		String str1=new String("hello");
		String str2=new String("hello");
		if(str1==str2)
			System.out.println("Both variables point to the same object(Using ==): true ");
		else
			System.out.println("Both variables point to the same object(Using ==): false ");
		if(str1.equals(str2))
			System.out.println("Both variables point to the same object(Using equals): true ");
		else
			System.out.println("Both variables point to the same object(Using equals): false ");
	}
}