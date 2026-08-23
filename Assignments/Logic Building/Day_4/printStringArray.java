import java.util.*;
public class printStringArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String[] name=new String[4];
		System.out.println("Enter 4 names: ");
		for(int i=0;i<4;i++)
			name[i]=sc.next();
		for(String names:name)
			System.out.print(names+" ");
	}
}