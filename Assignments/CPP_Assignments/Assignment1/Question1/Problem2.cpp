#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;
int main2()
{
	int readings;
	cout<<"Readings to enter: "<<endl;
	cin>>readings;
	double arr[readings];
	for(int i=0;i<readings;i++)
	{
		cin>>arr[i];
	}
	cout<<"Readings entered: "<<readings<<endl;
	cout<<"Valid Readings: ";
	int error_count=0;
	for(int i=0;i<readings;i++)
	{
		if(arr[i]<=0)
		{
			error_count++;
			continue;
		}
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	cout<<"Skipped (errors) : "<<error_count<<endl;
	for(int i=0;i<readings;i++)
	{
		if(arr[i] >= 45)
		{
			cout<<"First CRITICAL : Index "<<i<<" - "<<arr[i]<<endl;
		    break;
		}
	}

	double minval=arr[0];
	double maxval=arr[0];
	double avgval=0;
	double sum=0;
	for(int i=0;i<readings;i++)
	{
		minval=min(minval,arr[i]);
		maxval=max(maxval,arr[i]);
		sum += arr[i];
	}
	avgval=sum/readings;
	cout<<"Min: "<<minval<<"  Max: "<<maxval<<"  Avg: "<<avgval<<endl;

	int normal_count=0;
	int warning_count=0;
	int critical_count=0;
	int shutdown_count=0;
	for(int i=0;i<readings;i++)
	{
		if(arr[i]>0 && arr[i]<29)
			normal_count++;
		else if(arr[i]>30 && arr[i]<44)
			warning_count++;
		else if(arr[i]>45 && arr[i]<59)
			critical_count++;
		else if(arr[i>=60])
			shutdown_count++;
	}
	cout<<"Normal: "<<normal_count<<"  Warning: "<<warning_count<<"  Critical: "<<critical_count<<"  Shutdown: "<<shutdown_count<<endl;
	return 0;
}

/*

INPUT-
Readings to enter:
5
22.1
10.0
46.8
0
-5

OUTPUT-
Readings entered: 5
Valid Readings: 22.1 10 46.8
Skipped (errors) : 2
First CRITICAL : Index 2 - 46.8
Min: -5  Max: 46.8  Avg: 14.78
Normal: 2  Warning: 0  Critical: 1  Shutdown: 2
*/
