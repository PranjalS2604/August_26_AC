import java.util.*;
public class sum
{
	int sumOfTwoNumbers(int num1,int num2)
	{
		int result=num1 + num2;
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter second Number:");
		int num2=sc.nextInt();
		sum obj =new sum();
		int addResult=obj.sumOfTwoNumbers(num1,num2);
		System.out.println("The sum of "+num1+" and "+num2+"is: "+addResult);
	}
}	