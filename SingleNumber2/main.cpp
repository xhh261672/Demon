#include <iostream>
#include <algorithm>

using namespace std;

class Solution {
public:
    int singleNumber(int A[], int n) {
        sort(A,A+n);
        int i = 0, j = 2;
        for(;j+3<n;i+=3,j+=3){
            if(A[i] != A[j])
                return A[i];
        }
        return A[j+1];
    }
};

int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
