#include <iostream>
using namespace std;

double reorderCost(int qty, double unitPrice)
{
	 return qty * unitPrice;
}
double reorderCost(double qty, double unitPrice)
{
	return qty * unitPrice;
}
double reorderCost(int qty, double unitPrice, double taxRate)
{
	double baseCost = qty * unitPrice;
	return baseCost + (baseCost * (taxRate / 100.0));
}
double applyDiscount(double price, double discountPercent = 10.0)
{
    return price - (price * (discountPercent / 100.0));
}
int main2()
{
	cout << "=== TESTING PART B MODULES ===\n";
	    cout << "Reorder Cost Rs. " << reorderCost(10, 50.0) << "\n";
	    cout << "Reorder Cost Rs. " << reorderCost(5.5, 200.0) << "\n";
	    cout << "Reorder Cost Rs. " << reorderCost(10, 50.0, 18.0) << "\n";
	    cout << "Default Rs. " << applyDiscount(1000.0) << "\n";
	    cout << "Custom Rs. " << applyDiscount(1000.0, 25.0) << "\n";

	return 0;
}
