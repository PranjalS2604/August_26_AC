import java.util.*;
public class gradeSystem
{
	public static void main(String args[])
	{
		int Maths=80;
		int Science=85;
		int History=90;
		int average=(Maths+Science+History)/3;
		System.out.println("Avareage marks: "+average);
		if(average >=90)
			System.out.println("Grade: A");
		else if(average<=89 && average>=70)
			System.out.println("Grade: B");
		else if(average<=69 && average>=50)
			System.out.println("Grade: C");
		else if(average<=49 && average>=30)
			System.out.println("Grade: D");
		else
			System.out.println("Fail");
	}
}