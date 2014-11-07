#include <iostream>

using namespace std;
class Solution {
public:
    int maxSubArray(int A[], int n) {
        int result = A[0];
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += A[i];
            if (sum > result)
                result = sum;
            if (sum < 0)
                sum = 0;

        }

        return result;
    }

};
int main()
{
    Solution s;
    int A[10] = {1,-2,-3,-1,4,2,1,-5,4};
    cout<<s.maxSubArray(A, 10)<<endl;
    return 0;
}
