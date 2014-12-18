#include <iostream>
#include <vector>
using namespace std;

//O(N)solution
class Solution1 {
public:
    int findPeakElement(const vector<int> &num) {
        if (num.size() == 0)
            return -1;
        if (num.size() == 1)
            return 0;
        for (int i = 1; i < num.size(); i++){
            if (num[i] < num[i-1])
                return i-1;
        }
        return num.size() -1;
    }
};

//O(logN) solution

class Solution2 {
public:
    int findPeakElement (const vector<int> &num) {
        int left = 0, right = num.size() - 1;
        while (left <=right){
            if (left == right)
                return left;
            int mid = (left + right)/2;
            if (num[mid] < num[mid+1])
                left = mid + 1;
            else
                right = mid;
        }
    }
};


int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
