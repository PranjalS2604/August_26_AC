public class leapYear
{
	public static void checkYear(int year)
	{
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println(year+" is a leap year.");
		}
		else
			System.out.println(year+" is not a leap year.");
	}
	public static void main(String args[])
	{
		int year1=2024;
		checkYear(year1);

		int year2=1900;
		checkYear(year2);
	}
}