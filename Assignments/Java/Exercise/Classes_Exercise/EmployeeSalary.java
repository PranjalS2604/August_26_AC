
public class EmployeeSalary 
{
	double Salary;
	int Hours;
	void getInfo(double salary,int hours)
	{
		Salary=salary;
		Hours=hours;
	}
	void addSal()
	{
		if(Salary<500)
			Salary += 10;
	}
	void addWork()
	{
		if(Hours>6)
			Salary += 5;
	}
	void calSalary()
	{
		addSal();
		addWork();
		System.out.println("Total Salary of Employee is: "+Salary);
	}
	public static void main(String[] args) 
	{
		EmployeeSalary objEmp=new EmployeeSalary();
		objEmp.getInfo(400, 7);
		objEmp.calSalary();
	}

}
