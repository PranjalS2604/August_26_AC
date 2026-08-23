import java.util.*;
public class arrayLargestElement
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 5 Integers: ");
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("The largest element is: "+max);
	}
}