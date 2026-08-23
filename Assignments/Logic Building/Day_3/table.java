import java.util.*;
public class table
{
	void printMultiplicationTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			int result=num*i;
			System.out.println(num+" * "+i+"= "+result);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		table obj=new table();
		obj.printMultiplicationTable(num);
	}
}