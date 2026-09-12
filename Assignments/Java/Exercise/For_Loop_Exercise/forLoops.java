package forLoopExercise;

public class forLoops 
{
	public void odd()
	{
		for(int temp=1;temp<=1000;temp++)
		{
			if(temp%2!=0)
			{
				System.out.print(temp+" ");
			}
		}
	}
	
	public void even()
	{
		for(int temp=1;temp<=500;temp++)
		{
			if(temp%2==0)
			{
				System.out.print(temp+" ");
			}
		}
	}
	
	public void gap()
	{
		for(int temp=1;temp<=200;temp+=7)
		{
				System.out.print(temp+" ");
		}
	}
	
	public void pattern()
	{
		for(int iTemp=1;iTemp<=5;iTemp++)
		{
			for(int jTemp=1;jTemp<=iTemp;jTemp++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void reversePattern()
	{
		for(int iTemp=1;iTemp<=5;iTemp++)
		{
			for(int jTemp=5;jTemp>=iTemp;jTemp--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void numberPattern()
	{
		int num=1;
		for(int iTemp=1;iTemp<=4;iTemp++)
		{
			for(int jTemp=1;jTemp<=iTemp;jTemp++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	
	public void numberPattern1()
	{
		for(int iTemp=1;iTemp<=6;iTemp++)
		{
			for(int jTemp=1;jTemp<=iTemp;jTemp++)
			{
				System.out.print(jTemp+" ");
			}
			System.out.println();
		}
	}
	
	public void numberPattern2()
	{
		for(int iTemp=6;iTemp>0;iTemp--)
		{
			for(int jTemp=1;jTemp<=iTemp;jTemp++)
			{
				System.out.print(jTemp+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		forLoops loops=new forLoops();
		System.out.println("Odd Numbers from 1 to 1000 are: ");
		loops.odd();
		System.out.println();
		System.out.println();
		System.out.println("Even Numbers from 1 to 500 are: ");
		loops.even();
		System.out.println();
		System.out.println();
		System.out.println("Display Numbers after 7th number: ");
		loops.gap();
		System.out.println();
		System.out.println();
		System.out.println("Right Angle Pattern: ");
		loops.pattern();
		System.out.println();
		System.out.println();
		System.out.println("Reverse Right Angle Pattern: ");
		loops.reversePattern();
		System.out.println();
		System.out.println();
		System.out.println("Number Right Angle Pattern: ");
		loops.numberPattern();
		System.out.println();
		System.out.println();
		System.out.println("Number Right Angle Pattern1: ");
		loops.numberPattern1();
		System.out.println();
		System.out.println();
		System.out.println("Number Right Angle Pattern2: ");
		loops.numberPattern2();
	}

}
