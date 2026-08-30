#include <iostream>
#include <cmath>
using namespace std;
inline double distanceBetween(double x1,double y1,double x2,double y2)
{
	double distance=sqrt( pow(x2-x1,2)+pow(y2-y1,2) );
	return distance;
}
inline double toRadians(double degrees)
{
	double radian=degrees * (M_PI / 180.0);
	return radian;
}
inline double clamp(double value,double minVal,double maxVal)
{
	if(value<minVal)
		return minVal;

	if(value>maxVal)
		return maxVal;
	return value;
}
inline bool isInSafeZone(double x,double y,double cx,double cy,double radius)
{
	double distance=distanceBetween(x,y,cx,cy);
	if(distance<=radius)
	{
		return true;
	}
	return false;
}
int main()
{
	double radius=50.0;

	double homeX=0.0;
	double homeY=0.0;

	double x1=30,y1=40;
	double x2=60,y2=00;
	double x3=10,y3=20;

	cout<<"Waypoint 1:"<<endl;
	cout<<"Distance: "<<distanceBetween(homeX,homeY,x1,y1)<<endl;
	cout<<"Inside Safe Zone: "<< (isInSafeZone(x1,y1,homeX,homeY,radius)?"Yes" :"No")<<endl<<endl;

	cout<<"Waypoint 2:"<<endl;
	cout<<"Distance: "<<distanceBetween(homeX,homeY,x2,y2)<<endl;
	cout<<"Inside Safe Zone: "<< (isInSafeZone(x2,y2,homeX,homeY,radius)?"Yes" :"No")<<endl<<endl;

	cout<<"Waypoint 3:"<<endl;
	cout<<"Distance: "<<distanceBetween(homeX,homeY,x3,y3)<<endl;
	cout<<"Inside Safe Zone: "<< (isInSafeZone(x3,y3,homeX,homeY,radius)?"Yes" :"No")<<endl<<endl;
	return 0;
}
