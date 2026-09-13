class Member
{
	String Name;
	int Age;
	String Phone_no;
	String Address;
	float Salary;
	
	public void setName(String name) 
	{
		Name = name;
	}
	public void setAge(int age) 
	{
		Age = age;
	}
	public void setPhone_no(String phone_no) 
	{
		Phone_no = phone_no;
	}
	public void setAddress(String address) 
	{
		Address = address;
	}
	public void setSalary(float salary) 
	{
		Salary = salary;
	}
	public String getName() 
	{
		return Name;
	}
	public int getAge() 
	{
		return Age;
	}
	public String getPhone_no() 
	{
		return Phone_no;
	}
	public String getAddress() 
	{
		return Address;
	}
	public float getSalary() 
	{
		return Salary;
	}
	void printSalary()
	{
		System.out.println("Salary of member is: "+Salary);
	}
}
class PrimeMembers extends Member
{
	int JoiningYear;
	float JoiningFees;
	boolean isActive;
	
	public void setJoiningYear(int joiningYear) 
	{
		JoiningYear = joiningYear;
	}
	public void setJoiningFees(float joiningFees) 
	{
		JoiningFees = joiningFees;
	}
	public void setActive(boolean isActive) 
	{
		this.isActive = isActive;
	}
	public int getJoiningYear() 
	{
		return JoiningYear;
	}
	public float getJoiningFees() 
	{
		return JoiningFees;
	}
	public boolean isActive() 
	{
		return isActive;
	}
	void display()
	{
		System.out.println("Name of member is: "+Name);
		System.out.println("Age of member is: "+Age);
		System.out.println("Phone No. of member is: "+Phone_no);
		System.out.println("Address of member is: "+Address);
		System.out.println("Salary of member is: "+Salary);
		System.out.println("Joining Year of member is: "+JoiningYear);
		System.out.println("Joining Fees of member is: "+JoiningFees);
		//System.out.println(" of member is: "+isActive);
	}
}
public class MemberInfo
{
	public static void main(String[] args) 
	{
		PrimeMembers objMember=new PrimeMembers();
		System.out.println("Enter Member Details: ");
		System.out.println("Enter Name: ");
		String name=Console.getString();
		objMember.setName(name);
		System.out.println("Enter Age: ");
		int age=Console.getInt();
		objMember.setAge(age);
		System.out.println("Enter Phone Number: ");
		String phone=Console.getString();
		objMember.setPhone_no(phone);
		System.out.println("Enter Address: ");
		String address=Console.getString();
		objMember.setAddress(address);
		System.out.println("Enter Salary: ");
		float salary=Console.getFloat();
		objMember.setSalary(salary);
		System.out.println("Enter Joining Year: ");
		int year=Console.getInt();
		objMember.setJoiningYear(year);
		System.out.println("Enter Joining Fees: ");
		float fees=Console.getFloat();
		objMember.setJoiningFees(fees);
		
		objMember.display();
	}

}

