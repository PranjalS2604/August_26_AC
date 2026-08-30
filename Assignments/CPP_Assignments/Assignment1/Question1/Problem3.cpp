#include <iostream>
#include <algorithm>
using namespace std;
int main3()
{
	int floors=3;  //rows
	int rooms=3;   //columns
	double arr[3][3];
	cout<<"Enter Temperatures: "<<endl;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			cin>>arr[i][j];
		}
	}

	cout<<"	Room 0	Room 1	Room 2"<<endl;
	for(int i=0;i<3;i++)
	{
		cout<<"Floor "<<i<<" : ";
		for(int j=0;j<3;j++)
		{
			cout<<arr[i][j]<<"  ";
		}
		cout<<endl;
	}

	double hotroom=arr[0][0];
	int hot_floor_no;
	int hot_room_no;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(hotroom<arr[i][j])
			{
				hotroom=arr[i][j];
				hot_floor_no =i+1;
				hot_room_no=j+1;
			}

		}
	}
	cout<<"Hottest Room : Floor "<<hot_floor_no<<", Room "<<hot_room_no<<" - "<<hotroom<<endl;

	double sum1=0;
	double sum2=0;
	double sum3=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i==0)
				sum1 += arr[i][j];
			if(i==1)
				sum2 += arr[i][j];
			if(i==2)
				sum3 += arr[i][j];
		}
	}

	double avg1=sum1/3;
	double avg2=sum2/3;
	double avg3=sum3/3;
	int hotfloor = (avg1>avg2 && avg1>avg3) ? 1 : (avg2>avg1 && avg2>avg3) ? 2 : 3;
	//double max_avg=avg[hotfloor];
	cout<<"Hottest Floor : Floor "<<hotfloor<<" "<<endl;

	int warning_count=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(arr[i][j]>=30)
				warning_count++;
		}
	}
	cout<<"Rooms at WARNING or above : "<<warning_count<<endl;
	return 0;
}

/*
INPUT-
Enter Temperatures:
24
31.5
28
45
22
30
19
27.5
50.2

OUTPUT-
		Room 0	Room 1	Room 2
Floor 0 : 24  31.5  28
Floor 1 : 45  22  30
Floor 2 : 19  27.5  50.2
Hottest Room : Floor 3, Room 3 - 50.2
Hottest Floor : Floor 2
Rooms at WARNING or above : 4
*/
