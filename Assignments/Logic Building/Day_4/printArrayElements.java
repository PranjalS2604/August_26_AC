import java.util.*;
public class printArrayElements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter 5 integers: ");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int elements : arr)
		{
			System.out.print(elements+" ");
		}
	}
}
