import java.util.*;
public class sumArrayElements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter 5 Intergers:");
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		int sum=0;
		for(int elements : arr)
			sum=sum+elements;
		System.out.println("The sum of all numbers is: "+sum);
	}
}