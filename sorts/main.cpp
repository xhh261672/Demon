#include <iostream>

using namespace std;

void bublesort(int a[]){
    for (int i = 7; i >= 0; i--){
        for (int j = 0; j < i; j++){
            if (a[j] > a[j+1])
            {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }
}

int main()
{
    int a[] = {36,25,48,12,25,65,43,57};
    bublesort(a);
    for (int i = 0; i < 8; i++)
        cout<<a[i]<<" ";
    return 0;
}


