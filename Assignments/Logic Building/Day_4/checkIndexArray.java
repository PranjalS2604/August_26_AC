import java.util.*;
public class checkIndexArray
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 5 Integers: ");
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		System.out.println("Enter the number to search:");
		int element=sc.nextInt();
		int index=Arrays.binarySearch(arr, element);
		System.out.println("The number "+element+" is found at index "+((index<0) ? -1:index));
	}
}