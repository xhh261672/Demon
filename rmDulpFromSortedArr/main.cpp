#include <iostream>

using namespace std;

class Solution {
public:
    int removeDuplicates(int A[], int n) {
        int j = 0;
        for (int i = 0; i < n; i++){
            A[j] = A[i];
            if (i + 1 == n)
            {
                j++;
                break;
            }
            else if (A[j] != A[i + 1])
                j++;
        }
        return j;
    }
};
int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
