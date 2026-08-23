/*
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9
*/

public class rightangle4
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(2*i-1);j++)
			{
				if(j%2!=0)
					System.out.print(j);
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}