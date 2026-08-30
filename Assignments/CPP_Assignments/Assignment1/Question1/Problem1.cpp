#include <iostream>
using namespace std;

int main1()
{
	double Ctemp;
	cout<<"Enter Temperature: "<<endl;
	cin>>Ctemp;
	double ftemp=(Ctemp * 9/5)+32;
	cout<<"Temperature : "<<Ctemp<<"^C / "<<ftemp<<"^F"<<endl;
	int status_code;
		if(Ctemp <0)
		{
			status_code=-1;
			cout<<"Status : SENSOR_ERROR"<<endl;
		}
		else if(Ctemp>0 && Ctemp<29)
		{
			status_code=0;
			cout<<"Status : NORMAL"<<endl;
		}
		else if(Ctemp>30 && Ctemp<44)
		{
			status_code=1;
			cout<<"Status : WARNING"<<endl;
		}
		else if(Ctemp>45 && Ctemp<59)
		{
			status_code=2;
			cout<<"Status : CRITICAL"<<endl;
		}
		else
		{
			status_code=3;
			cout<<"Status : SHUTDOWN"<<endl;
		}

	switch(status_code)
	{
	case -1:
	{
		cout<<"Action : Sensor fault - check wiring"<<endl;
		break;
	}
	case 0:
		{
			cout<<"Action : No Action Required"<<endl;
			break;
		}
	case 1:
		{
			cout<<"Action : Alert sent to supervisor"<<endl;
			break;
		}
	case 2:
		{
			cout<<"Action : Cooling System triggered"<<endl;
			break;
		}
	case 3:
		{
			cout<<"Action : Emergency shutdown initiated"<<endl;
			break;
		}
	}

	string read = (Ctemp >= 25) ? "Above_Average" : "Below_Average";
	cout<<"Reading : "<<read<<endl;
	return 0;
}



/*
INPUT-
Enter Temperature:
72.7

OUTPUT-
Temperature : 72.7^C / 162.86^F
Status : SHUTDOWN
Action : Emergency shutdown initiated
Reading : Above_Average
*/
