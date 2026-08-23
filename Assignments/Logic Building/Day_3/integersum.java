import java.util.*;
public class integersum
{
	void calculateSum(int num)
	{
		int result=0;
		for(int i=1;i<=num;i++)
		{
			result=result+i;
		}
		System.out.println("The sum of numbers from 1 to "+num+" is: "+ result);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num =sc.nextInt();
		integersum obj=new integersum();
		obj.calculateSum(num);
	}
}
