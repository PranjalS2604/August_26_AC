
public class Employee 
{
	String name;
	int year;
	String address;
	
	Employee(String name,int year,String address)
	{
		this.name=name;
		this.year=year;
		this.address=address;
	}
	void display()
	{
		System.out.println(name+"\t"+year+"\t"+address);
	}
	public static void main(String[] args)
	{
		System.out.println("Name  Year Of Joining  Address");
		Employee objEmp1=new Employee("Robert",1994,"64C-WallsStreat");
		objEmp1.display();
		Employee objEmp2=new Employee("Sam",2000,"68D-WallsStreat");
		objEmp2.display();
		Employee objEmp3=new Employee("John",1999,"26B-WallsStreat");
		objEmp3.display();
		
	}
}
