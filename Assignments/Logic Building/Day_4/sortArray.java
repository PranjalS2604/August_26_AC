import java.util.*;
public class sortArray
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 5 Integers: ");
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		System.out.print("Sorted Array: "+Arrays.toString(arr));
	}
}




