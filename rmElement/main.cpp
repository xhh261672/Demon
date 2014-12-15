#include <iostream>
#include <cstring>
using namespace std;

class Solution {
public:
    int removeElement(int A[], int n, int elem) {
        int counter = 0;
        int *B = new int[n];
        memset(B, 0, n);
        for (int i = 0, j = 0; i < n;){
            if (A[i] == elem)
            {
                i++;
                continue;
            }
            else
            {
                B[j] = A[i];
                i++,j++;
                counter ++;
            }
        }
        int n2 = n - counter;
        for (int i = 0; i < n; i++){
            if (i < n2)
                A[i] = B[i];
            else
                A[i] = 0;
        }
        return n2;
    }
};

int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
