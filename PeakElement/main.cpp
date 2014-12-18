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


int main()
{
    cout << "Hello world!" << endl;
    return 0;
}
