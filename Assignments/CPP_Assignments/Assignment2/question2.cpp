#include <iostream>
using namespace std;

class Patient
{
private:
	int patientId;
	string name;
	int age;
	string ward;
	const string bloodGroup;
public:
	Patient(): patientId(0), name("Unknown"), age(0), ward("General"), bloodGroup("O+")
	{
		cout<<"Default Patient Registered."<<endl;
	}

	Patient(int id, const string& name): patientId(id), name(name), age(0), ward("Emergency"), bloodGroup("Unknown")
	{
		cout<<"[Constructor] Emergency :"<<name<<endl;
	}
	Patient(int id, const string& name, int age, const string& ward, const string&
	bg) : patientId(id), name(name), age(age), ward(ward), bloodGroup(bg)
	{
		cout<<"[Constructor] Full Admission :"<<name<<endl;
	}
	~Patient()
	{
		cout<<"Patient "<<name<<" Discharged."<<endl;
	}
	void displayRecord() const
	{
		cout<<"ID : "<<patientId<<"\n";
		cout<<"Name : "<<name<<"\n";
		cout<<"Age : "<<age<<"\n";
		cout<<"Ward : "<<ward<<"\n";
		cout<<"Blood Group : "<<bloodGroup<<endl;
	}
	void transferWard(const string& newWard)
	{
		cout<<"Ward transfer : "<<name<<"->"<<newWard<<endl;
		ward=newWard;
	}
};
int main3()
{
	Patient p1;
	Patient p2(1,"Pranjal");
	Patient p3(2,"Jayesh",18,"icu","A+");

	Patient* arr=new Patient[4];

	cout<<"Patient Record: "<<endl;
	p3.displayRecord();

	cout<<"Ward Transfer : ";
	p2.transferWard("Cardiology");

	delete[] arr;
	return 0;
}
