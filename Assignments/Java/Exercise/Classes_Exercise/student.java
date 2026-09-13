
public class student 
{
	String name;
	int roll_no;
	String phone_no;
	String address;
	student(String sname,int roll,String phone,String saddress)
	{
		name=sname;
		roll_no=roll;
		phone_no=phone;
		address=saddress;
	}
	void display()
	{
		System.out.println("Name: "+name+"\n"+"Roll No: "+roll_no+"\n"+"Phone No: "+phone_no+"\n"+"Address: "+address);
	}

	public static void main(String[] args) 
	{
		student objstud1=new student("Sam",1,"1234567890","Nashik");
		student objstud2=new student("John",2,"9087654321","Pune");
		System.out.println("Student 1 Details: ");
		objstud1.display();
		System.out.println();
		System.out.println("Student 2 Details: ");
		objstud2.display();

	}

}
