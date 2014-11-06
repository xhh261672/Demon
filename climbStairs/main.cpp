#include <iostream>
#include <vector>
using namespace std;


class Solution {
public:
    /**************TLE******************/
//    int climbStairs(int n) {
//        if (n < 0)
//            return 0;
//        if (n == 2)
//            return 2;
//        if (n == 1 || n ==0)
//            return 1;
//        else
//            return climbStairs(n - 1) + climbStairs(n - 2);
//    }

    int climbStairs(int n) {
        vector <int> num(n+1);
        num[0] = 0;
        num[1] = 1;
        num[2] = 2;

        for (int i= 3; i <=n; i++)
            num[i] = num[i-1] + num[i-2];

        return num[n];
    }
};

int main()
{
    Solution solution;
    cout<<solution.climbStairs(44)<<endl;
    return 0;
}
