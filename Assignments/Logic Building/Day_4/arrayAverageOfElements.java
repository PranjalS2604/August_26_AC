import java.util.*;
public class arrayAverageOfElements
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 5 Integers: ");
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		int sum=0;
		for(int numbers:arr)
			sum=sum+numbers;
		int average=sum/5;
		System.out.println("The average of the numbers is: "+average);
	}
}