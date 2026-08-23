import java.util.*;

public class menuDrivenProgram 
{

   	 // datatypes
    static class DefaultValues 
    {
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        char g;
        boolean h;

        void display() 
	{
            System.out.println("--- Default Values ---");
            System.out.println("byte: " + a);
            System.out.println("short: " + b);
            System.out.println("int: " + c);
            System.out.println("long: " + d);
            System.out.println("float: " + e);
            System.out.println("double: " + f);
            System.out.println("char: [" + g + "] (null character)");
            System.out.println("boolean: " + h);
        }
    }

    // leap Year
    public static void checkLeapYear(int year) 
    {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
	{
            System.out.println(year + " is a leap year.");
        } else 
	{
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            
            System.out.println("\n===== MENU =====");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            choice = sc.nextInt();
            System.out.println(); 

            switch (choice) {
                case 1:
                    // Problem 1: Grade Evaluation System
                    int maths = 80;
                    int science = 85;
                    int history = 90;
                    int average = (maths + science + history) / 3;
                    
                    System.out.println("Average marks: " + average);
                    if (average >= 90) {
                        System.out.println("Grade: A");
                    } else if (average <= 89 && average >= 70) {
                        System.out.println("Grade: B");
                    } else if (average <= 69 && average >= 50) {
                        System.out.println("Grade: C");
                    } else if (average <= 49 && average >= 30) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Fail");
                    }
                    break;

                case 2:
                    // Problem 2: Leap Year Check
                    int year1 = 2024;
                    checkLeapYear(year1);

                    int year2 = 1900;
                    checkLeapYear(year2);
                    break;

                case 3:
                    // Problem 3: Day of the week
                    System.out.print("Enter Day Number (1-7): ");
                    int dayNum = sc.nextInt();
                    
                    switch (dayNum) {
                        case 1: System.out.println("The day is Monday."); break;
                        case 2: System.out.println("The day is Tuesday."); break;
                        case 3: System.out.println("The day is Wednesday."); break;
                        case 4: System.out.println("The day is Thursday."); break;
                        case 5: System.out.println("The day is Friday."); break;
                        case 6: System.out.println("The day is Saturday."); break;
                        case 7: System.out.println("The day is Sunday."); break;
                        default: System.out.println("Invalid day Number"); break;
                    }
                    break;

                case 4:
                    // Problem 4: Default Values
                    DefaultValues dv = new DefaultValues();
                    dv.display();
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select an option between 1 and 5.");
            }
        } while (choice != 5);

        sc.close();
    }
}