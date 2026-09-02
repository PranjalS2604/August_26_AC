#include <iostream>
using namespace std;

class Entity
{
private:
	string name;
	int health;
	int level;
	string type;

public:
	Entity& setName(const string& name)
	{
		this->name = name;
		return *this;
	}
	Entity& setHealth(int health)
	{
		this->health = health;
		return *this;
	}
	Entity& setLevel(int level)
	{
		this->level = level;
		return *this;
	}
	Entity& setType(const string& type)
	{
		this->type = type;
		return *this;
	}


	string getName() const
	{
		return name;
	}
	int getHealth() const
	{
		return health;
	}
	int getLevel() const
	{
		return level;
	}
	string getType() const
	{
		return type;
	}

	void displayInfo() const
	{
		cout<<"Name: "<<getName()<<endl;
		cout<<"Health: "<<getHealth()<<endl;
		cout<<"Level: "<<getLevel()<<endl;
		cout<<"Type: "<<getType()<<endl;
	}
};

namespace Physics
{
	double clamp(double val, double min, double max)
	{
		if (val < min)
			return min;
		if (val > max)
			return max;
		return val;
	}
	double lerp(double a, double b, double t)
	{
		return a + t * (b - a);
	}
}

namespace GameMath
{
	int clamp(int val, int min, int max)
	{
		if (val < min)
			return min;
		if (val > max)
			return max;
		return val;
	}
	double lerp(double a, double b, double t)
	{
		return a + t * (b - a);
	}
}

int main()
{
	Entity player, enemy, item;
	player.setName("Aragorn").setHealth(100).setLevel(10).setType("Player");
	enemy.setName("Orc").setHealth(60).setLevel(5).setType("Enemy");
	item.setName("HealthPotion").setHealth(0).setLevel(1).setType("Item");

	cout<<"-----User Information-----"<<endl;
	player.displayInfo();
	cout<<endl;
	enemy.displayInfo();
	cout<<endl;
	item.displayInfo();

	cout<<endl;
	cout <<"--- Namespace Resolution ---"<<endl;
	double currentVelocity = 120.5;
	double maxVelocity = 100.0;
	double minVelocity = 0.0;
	double physicsClamp = Physics::clamp(currentVelocity, minVelocity, maxVelocity);
	cout << "Physics clamped velocity: " << physicsClamp << " m/s"<<endl;

	int currentHealth = -15;
	int minHealth = 0;
	int maxHealth = 100;
	int gameMathClamp = GameMath::clamp(currentHealth, minHealth, maxHealth);
	cout << "GameMath clamped health: " << gameMathClamp << " HP\n\n";

	cout<<endl;
	cout<<"=====Game Map====="<<endl;
	int rows=3;
	int cols=4;
	int** array = new int*[rows];
	for (int i = 0; i < rows; ++i)
	{
        array[i] = new int[cols];
    }
	cout << "\nEnter elements for a " << rows << "x" << cols << " matrix:\n";
	for (int i = 0; i < rows; ++i)
	{
        for (int j = 0; j < cols; ++j)
        {
	        cout << "Element [" << i << "][" << j << "]: ";
	        cin >> array[i][j];
	    }
	}

	cout << "\nThe entered 2D array is:\n";
	for (int i = 0; i < rows; ++i)
	{
	        for (int j = 0; j < cols; ++j)
	        {
	            cout << array[i][j] << " ";
	        }
	        cout << "\n";
	 }

	cout << "Legend: 0=Grass  1=Water  2=Mountain  3=Forest  4=Dungeon\n";

	int counts[5] = {0, 0, 0, 0, 0};

	for (int i = 0; i < rows; i++)
	{
	        for (int j = 0; j < cols;j++)
	        {
	            int tileType = array[i][j];
	            if (tileType >= 0 && tileType <= 4)
	            {
	                counts[tileType]++;
	            }
	        }
	}

	cout << "Tile Count:\n";
	cout << "Grass    : " << counts[0] << endl;
	cout << "Water    : " << counts[1] << endl;
	cout << "Mountain : " << counts[2] << endl;
	cout << "Forest   : " << counts[3] << endl;
	cout << "Dungeon  : " << counts[4] << endl;

	for (int i = 0; i < rows; ++i)
	{
	    delete[] array[i];
	}
	    delete[] array;

	return 0;
}
