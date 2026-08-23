import java.util.*;
public class evennumber
{
	void printEvenNumbers()
	{
		int i=1;
		while(i<=50)
		{
			if(i%2==0)
				System.out.print(i+" ");
			i++;
		}
	}
	public static void main(String args[])
	{
		evennumber obj=new evennumber();
		System.out.println("Even Numbers:");
		obj.printEvenNumbers();	
	}
}