#include <iostream>
using namespace std;
class Product
{
private:
	int productId;
	string name;
	double price;
	int quantity;
public:
	void acceptDetails(int index)
	{
		cout<<"Enter Product "<<index<<" Details: "<<endl;
		cin>>productId>>name>>price>>quantity;
	}
	void displayDetails()const
	{
			cout<<productId<<"\t"<<name<<"\t"<<price<<"\t"<<quantity<<"\t"<<price * quantity<<endl;
	}
	double totalValue()const
	{
		return price * quantity;
	}
	bool isLowStock(int threshold)const
	{
		return quantity < threshold;
	}
};
int main1()
{
	Product arr[5];

	for(int i=0;i<5;i++)
	{
		arr[i].acceptDetails(i+1);
	}

	cout << "===== INVENTORY REPORT=====" << endl;
	cout << "ID\tName\tPrice\tQty\tTotal Value " << endl;
	for(int i=0;i<5;i++)
	{
		arr[i].displayDetails();
	}

	double maxvalue=0;
	for(int i=0;i<5;i++)
	{
		if(arr[i].totalValue()>maxvalue)
		{
			maxvalue = arr[i].totalValue();
		}
	}
	cout<<"Highest Value Product : "<<maxvalue<<endl;

	bool lowstockfound=false;
	for(int i=0;i<5;i++)
	{
		if(arr[i].isLowStock(10))
		{
			lowstockfound=true;
			break;
		}
	}
	cout << "Low Stock Present (threshold:10): " << (lowstockfound ? "Yes" : "No") << endl;
	return 0;
}
