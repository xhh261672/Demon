#include <iostream>

using namespace std;

class Solution {
public:
    int Find(int A[], int left, int right, int target)
    {
        int mid = (left + right)/2;
        if (A[mid] == target)
            return mid;
        else if (left == mid)
        {
            if (target > A[right])
                return right + 1;
            else if (target < A[left])
                return left;
            else
                return right;
        }
            //return left;
        else if (target < A[mid])
            return Find(A, left, mid-1, target);
        else
            return Find(A, mid, right, target);
    }
    int searchInsert(int A[], int n, int target) {
        Find(A, 0, n-1, target);
    }
};


int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
