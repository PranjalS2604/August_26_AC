#include <iostream>
using namespace std;

int main()
{
    int statusReg  = 0b10110001;
    int controlReg = 0b00000000;
    int dataReg    = 0b11001010;

    // ------------------------------------------------
    // 1. Pointer to const
    // const int* = value cannot be changed through pointer
    // Pointer itself can point somewhere else
    // ------------------------------------------------

    const int* regPtr1 = &statusReg;

    cout << "Status Register: " << *regPtr1 << endl;

    // *regPtr1 = 10;
    // ERROR: Cannot modify value through pointer-to-const

    regPtr1 = &dataReg;   // Allowed: pointer can point to another variable

    cout << "regPtr1 now points to: " << *regPtr1 << endl;


    // ------------------------------------------------
    // 2. Const pointer
    // int* const = pointer address cannot change
    // Value can be changed through pointer
    // ------------------------------------------------

    int* const regPtr2 = &controlReg;

    *regPtr2 = 100;   // Allowed: modify control register

    cout << "Control Register: " << *regPtr2 << endl;

    // regPtr2 = &dataReg;
    // ERROR: Cannot change address of a const pointer


    // ------------------------------------------------
    // 3. Const pointer to const
    // const int* const = cannot change value
    // and cannot change pointer address
    // ------------------------------------------------

    const int* const regPtr3 = &statusReg;

    cout << "ROM/Status Value: " << *regPtr3 << endl;

    // *regPtr3 = 50;
    // ERROR: Cannot modify value through pointer

    // regPtr3 = &dataReg;
    // ERROR: Cannot change address because pointer is const


    return 0;
}
