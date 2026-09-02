#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int main(int argc, char* argv[])
{
    // 1. Check arguments
    if (argc != 4)
    {
        cout << "Usage   : ./sensor_monitor" << endl;
        cout << "Error   : Missing arguments." << endl;
        return 1;
    }

    // 2. Get values from command line
    int warn = atoi(argv[1]);
    int critical = atoi(argv[2]);
    int num = atoi(argv[3]);

    // 3. Check warn < critical
    if (warn >= critical)
    {
        cout << "Error : Warn must be less than Critical." << endl;
        return 1;
    }

    // 4. Check number of readings
    if (num < 1 || num > 500)
    {
        cout << "Error : Readings must be 1 to 500." << endl;
        return 1;
    }

    // 5. Counters
    int normal = 0;
    int warning = 0;
    int criticalCount = 0;
    int shutdown = 0;

    srand(time(0));

    // 6. Generate readings
    for (int i = 0; i < num; i++)
    {
        int temp = rand() % 70;

        if (temp >= 60)
            shutdown++;
        else if (temp >= critical)
            criticalCount++;
        else if (temp >= warn)
            warning++;
        else
            normal++;
    }

    // 7. Print result
    cout << "Config  : Warn=" << warn
         << "  Critical=" << critical
         << "  Readings=" << num << endl;

    cout << "Results : Normal:" << normal
         << "  Warning:" << warning
         << "  Critical:" << criticalCount
         << "  Shutdown:" << shutdown << endl;

    return 0;
}
