import java.util.*;
public class positivenumber
{
	void askForPositiveNumber()
	{
		int num;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter a Positive Number: ");
			num=sc.nextInt();	
		}while(num<=0);
		System.out.println("You have entered positive number: "+num);
	}
	public static void main(String args[])
	{
		positivenumber obj=new positivenumber();
		obj.askForPositiveNumber();
	}
}