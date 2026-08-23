import java.util.*;
public class positiveNegativeNumArray
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 6 Integers: ");
		int[] arr=new int[6];
		for(int i=0;i<6;i++)
			arr[i]=sc.nextInt();
		int positivecount=0;
		int negativecount=0;
		int zerocount=0;
		for(int numbers:arr)
		{
			if(numbers>0)
				positivecount++;
			else if(numbers<0)
				negativecount++;
			else
				zerocount++;
		}
		System.out.println("Positive Numbers: "+positivecount);
		System.out.println("Negative Numbers: "+negativecount);
		System.out.println("Zero numbers: "+zerocount);
	}
}