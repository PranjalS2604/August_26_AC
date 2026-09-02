#include <iostream>
using namespace std;

class Employee
{
private:
	int empId;
	string name;
	string department;
	char grade;
	double basicSalary;
	bool isActive;
	static int employeeCount;

public:

	Employee()
	{
		empId = 0;
		name = "Unknown";
		department = "Engineering";
		grade = 'D';
		basicSalary = 10000;
		isActive = true;
		employeeCount++; // Increment count when created
	}
	~Employee()
	{
		employeeCount--;
	}

	void setBasicSalary(double basicSalary)
	{
		if(basicSalary>10000 && basicSalary<500000)
			this->basicSalary = basicSalary;
		else
			cout<<"Salary must be between Rs.10,000 and Rs.5,00,000. Value rejected."<<endl;
	}

	void deactivate()
	{
		this->isActive = false;
	}

	void setDepartment(const string &department)
	{
		if(department== "Engineering" ||department== "HR" || department== "Finance" || department=="Operations")
			this->department = department;
		else
			cout<<department<<" is not registered department."<<endl;
	}

	void setEmpId(int empId)
	{
		this->empId = empId;
	}

	void setGrade(char grade)
	{
		if(grade=='A' || grade=='B' || grade=='C' || grade=='D')
			this->grade = grade;
		else
			cout<<"Invalid grade '"<<grade<<"'. Accepted values: A, B, C, D."<<endl;
	}

	void setIsActive(bool isActive)
	{
		this->isActive = isActive;
	}

	void setName(const string &name)
	{
		if(name!="")
			this->name = name;
	}

	double getBasicSalary() const
	{
		return basicSalary;
	}

	const string& getDepartment() const
	{
		return department;
	}

	int getEmpId() const
	{
		return empId;
	}

	static int getEmployeeCount()
	{
		return employeeCount;
	}

	char getGrade() const
	{
		return grade;
	}

	bool isIsActive() const
	{
		return isActive;
	}

	const string& getName() const
	{
		return name;
	}

	double computeAllowances()const
	{
		double allowance;
		if(grade=='A')
			allowance=basicSalary * 40/100 ;
		if(grade=='B')
			allowance=basicSalary * 30/100 ;
		if(grade=='C')
			allowance=basicSalary * 20/100 ;
		if(grade=='D')
			allowance=basicSalary * 10/100 ;
		return allowance;
	}

	double computeGrossSalary() const
	{
		double gross=basicSalary + computeAllowances();
		return gross;
	}

	double computeTax()const
	{
		double gross=computeGrossSalary();
		if(gross <= 50000)
			return 0;
		else if(gross>50000 && gross<=100000)
			return gross * 10/100;
		else
			return 5000 + (gross - 100000) * 20 / 100;
	}

	double computeNetSalary() const
	{
		return computeGrossSalary() - computeTax();
	}

	void printPayslip() const
	{
		if (!isIsActive())
		{
			cout << "Skipping Payslip: Employee " << name << " is inactive." << endl << endl;
			return;
		}
		cout<<"========================="<<endl;
		cout<<"Employee Payslip - AUG 2026"<<endl;
		cout<<"========================="<<endl;
		cout<<"Emp ID: "<<getEmpId()<<endl;
		cout<<"Name : "<<getName()<<endl;
		cout<<"Department : "<<getDepartment()<<endl;
		cout<<"Grade : "<<getGrade()<<endl;
		cout<<"Status : "<<isIsActive()<<endl;
		cout<<"------------------------"<<endl;
		cout<<"Basic Salary : "<<getBasicSalary()<<endl;
		cout<<"Allowances : "<<computeAllowances()<<endl;
		cout<<"Gross Salary : "<< computeGrossSalary()<<endl;
		cout<<"------------------------"<<endl;
		cout<<"Tax Deduction : "<< computeTax()<<endl;
		cout<<"Net Salary : "<<computeNetSalary()<<endl;
		cout<<"========================="<<endl;
	}

	void acceptDetails()
	{
		int id;
		string nm, dept;
		char gr;
		double sal;

		cout << "\nEnter Employee Details: " << endl;
		cout << "Enter ID: ";
		cin >> id;
		setEmpId(id);
		cin.ignore(); // Clears the newline character from the buffer
		cout << "Enter Name: ";
		getline(cin, nm);
		setName(nm);
		cout << "Enter Department (Engineering, HR, Finance, Operations): ";
		getline(cin, dept);
		setDepartment(dept);
		cout << "Enter Grade (A, B, C, D): ";
		cin >> gr;
		setGrade(gr);
		cout << "Enter Basic Salary: ";
		cin >> sal;
		setBasicSalary(sal);
	}
};
int Employee::employeeCount = 0;

int main()
{
	Employee e1;
	Employee* e2 = new Employee();
	Employee* e3 = new Employee();

	e1.acceptDetails();
	e2->acceptDetails();
	e3->acceptDetails();

	e1.printPayslip();
	e2->printPayslip();
	e3->printPayslip();

	e3->deactivate();
	if (!e3->isIsActive())
	cout << e3->getName() << " is no longer active. Payroll skipped." << endl;
	cout << "Total Employees : " << Employee::getEmployeeCount() << endl;

	delete e2;
	delete e3;

	return 0;
}
