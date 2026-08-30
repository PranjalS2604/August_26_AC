#include <iostream>
using namespace std;
bool parsepacket(const int *rawdata,int size,int **outMin, int **outMax)
{
	if(size<=0)
	{
		return false;
	}
	int minIndex=0;
	int maxIndex=0;
	for(int i=0;i<size;i++)
	{
		if(rawdata[i]<rawdata[minIndex])
			minIndex=i;

		if(rawdata[i]>rawdata[maxIndex])
			maxIndex=i;
	}
	*outMin = const_cast<int*>(&rawdata[minIndex]);
	*outMax = const_cast<int*>(&rawdata[maxIndex]);
	return true;
}
int main4()
{
	int packet[]= {45,12,67,8,55,31};
	int *minPtr=nullptr;
	int *maxPtr=nullptr;
	if(parsepacket(packet,6,&minPtr,&maxPtr))
	{
		cout<<"Calibration Min: "<< *minPtr<<endl;
		cout<<"Calibration Max: "<< *maxPtr<<endl;
	}
	return 0;
}
