import java.util.*;
public class areaOfSquare
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Side Length: ");
		int side=sc.nextInt();
		int area=side*side;
		System.out.println("Area Of square:"+area);
	}
}