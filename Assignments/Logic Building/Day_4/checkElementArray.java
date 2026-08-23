import java.util.*;
public class checkElementArray
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 5 Integers: ");
		Integer[] arr=new Integer[5];
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the number to search:");
		int element=sc.nextInt();
		boolean ispresent=Arrays.asList(arr).contains(element);
		String result=(ispresent) ? "Found":"Not Found";
		System.out.println(result);
	}
}