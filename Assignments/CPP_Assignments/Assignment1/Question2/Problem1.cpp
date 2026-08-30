#include <iostream>
using namespace std;
void resetSensorPairV1(int reading1,int reading2)
{
	int temp=reading1;
	reading1=reading2;
	reading2=temp;
}
void resetSensorPairV2(int &reading1,int &reading2)
{
	int temp=reading1;
	reading1=reading2;
	reading2=temp;
}
void resetSensorPairV3(int *reading1, int *reading2)
{
	int temp=*reading1;
	*reading1=*reading2;
	*reading2=temp;
}
int main1()
{
	int reading1;
	int reading2;
	cout<<"Enter Reading 1: ";
	cin>>reading1;
	cout<<"Enter Reading 2: ";
	cin>>reading2;
	cout<<"--- V1: Call by Value --- "<<endl;      //does not changes value because it changes value only at block/function no actual values will get change.
	cout<<"Before : A="<<reading1<<"  B="<<reading2<<endl;
	resetSensorPairV1(reading1,reading2);
	cout<<"After : A="<<reading1<<"  B="<<reading2<<endl;

	cout<<"--- V2: Call by Reference --- "<<endl;
	cout<<"Before : A="<<reading1<<"  B="<<reading2<<endl;
	resetSensorPairV2(reading1,reading2);
	cout<<"After : A="<<reading1<<"  B="<<reading2<<endl;

	cout<<"--- V3: Call by Pointer --- "<<endl;
	cout<<"Before : A="<<reading1<<"  B="<<reading2<<endl;
	resetSensorPairV3(&reading1,&reading2);
	cout<<"After : A="<<reading1<<"  B="<<reading2<<endl;
	return 0;
}
