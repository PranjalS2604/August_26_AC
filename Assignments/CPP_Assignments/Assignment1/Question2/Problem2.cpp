#include <iostream>
#include <cmath>

using namespace std;

double computeRMS(double* signal, int n)
{
    double sum = 0.0;

    for (int i = 0; i < n; i++)
    {
        sum += (*(signal + i)) * (*(signal + i));
    }

    return sqrt(sum / n);
}

void normalise(double* signal, int n)
{
    double maxVal = 0.0;

    for (int i = 0; i < n; i++)
    {
        if (fabs(*(signal + i)) > maxVal)
        {
            maxVal = fabs(*(signal + i));
        }
    }

    if (maxVal != 0)
    {
        for (int i = 0; i < n; i++)
        {
            *(signal + i) = *(signal + i) / maxVal;
        }
    }
}

int countZeroCrossings(double* signal, int n)
{
    int count = 0;

    for (int i = 0; i < n - 1; i++)
    {
        if ((*(signal + i) > 0 && *(signal + i + 1) < 0) ||
            (*(signal + i) < 0 && *(signal + i + 1) > 0))
        {
            count++;
        }
    }

    return count;
}

void applyGain(double* signal, int n, double gainFactor)
{
    for (int i = 0; i < n; i++)
    {
        *(signal + i) = *(signal + i) * gainFactor;
    }
}

int main2()
{
    double signal[7] = {
        0.5, -1.2, 0.8, -0.3, 1.0, -0.9, 0.1
    };

    cout << "Original Array: ";
    for (int i = 0; i < 7; i++)
    {
        cout << *(signal + i) << " ";
    }
    cout << endl;

    double rms = computeRMS(signal, 7);
    cout << "RMS: " << rms << endl;

    int count = countZeroCrossings(signal, 7);
    cout << "Count of zero crossings: " << count << endl;

    normalise(signal, 7);

    cout << "Normalise Array: ";
    for (int i = 0; i < 7; i++)
    {
        cout << *(signal + i) << " ";
    }
    cout << endl;

    applyGain(signal, 7, 2);

    cout << "applyGain Array: ";
    for (int i = 0; i < 7; i++)
    {
        cout << *(signal + i) << " ";
    }
    cout << endl;

    return 0;
}
