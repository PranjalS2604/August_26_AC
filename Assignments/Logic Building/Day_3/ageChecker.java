import java.util.*;
public class ageChecker
{
	void checkAgeCategory(int age)
	{
		String category = (age<18) ? "You are Minor" : (age>=18 && age<60)? "You are an Adult" : "You are Senior Citizen";
		System.out.println(category);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		ageChecker obj=new ageChecker();
		obj.checkAgeCategory(age);
	}
}